SUMMARY = "Python module for parsing semi-structured text into python tables"
DESCRIPTION = "Python module which implements a template based state machine for parsing \
semi-formatted text. Originally developed to allow programmatic access to \
information returned from the command line interface (CLI) of networking \
devices."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "python39-textfsm-1.1.3-1.6.noarch.rpm"
RPM_HASH = "16916a03def79ec0831afafad5bf75a168c59de2aa1a5cfa76fe8590ba95d3e2d180f045483985cb8be2dd72111520f8efe36aa2c3a8313ba712d703b566a430"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-textfsm \
python39-textfsm \
python3dist-textfsm"

RDEPENDS:${PN} += "python-abi \
python39-future \
python39-six"

inherit rpm
