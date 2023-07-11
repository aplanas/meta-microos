SUMMARY = "Python module for parsing semi-structured text into python tables"
DESCRIPTION = "Python module which implements a template based state machine for parsing \
semi-formatted text. Originally developed to allow programmatic access to \
information returned from the command line interface (CLI) of networking \
devices."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "python39-textfsm-1.1.3-1.8.noarch.rpm"
RPM_HASH = "6bd5b922e4d0f4ad0b1c5064c6ff0b9b6aaafdad6a2c02347e9a11eabb12d50815198f6bf56ebeb2da40a6d0e4473c601ec8fcff042ae9a988c9d7033126aff2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-textfsm \
python39-textfsm \
python3dist-textfsm"

RDEPENDS:${PN} += "python-abi \
python39-future \
python39-six"

inherit rpm
