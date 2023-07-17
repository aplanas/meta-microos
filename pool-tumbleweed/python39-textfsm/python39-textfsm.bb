SUMMARY = "Python module for parsing semi-structured text into python tables"
DESCRIPTION = "Python module which implements a template based state machine for parsing \
semi-formatted text. Originally developed to allow programmatic access to \
information returned from the command line interface (CLI) of networking \
devices."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "python39-textfsm-1.1.3-2.1.noarch.rpm"
RPM_HASH = "0c3eb8316b775575cbe604f794c22b43df0b2d6e57a4c00dea87a641b8494e6c13cb904a04d7f186d0b3a67c2ed90e7dc8619ed4918c34ecd8ddc9d30ee10477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-textfsm \
python39-textfsm \
python3dist-textfsm"

RDEPENDS:${PN} += "python-abi \
python39-future \
python39-six"

inherit rpm
