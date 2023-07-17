SUMMARY = "Python module for parsing semi-structured text into python tables"
DESCRIPTION = "Python module which implements a template based state machine for parsing \
semi-formatted text. Originally developed to allow programmatic access to \
information returned from the command line interface (CLI) of networking \
devices."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "python311-textfsm-1.1.3-2.1.noarch.rpm"
RPM_HASH = "558c8d85b2187b917e8a05368af8270b2b8230ef709fd4b4bb2eb31f2f2b4fdf7af0d99ce480cccb5c4544620f46e9b81dc442e7aa1d08106e80464cbaac942e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-textfsm \
python3.11dist-textfsm \
python311-textfsm \
python3dist-textfsm"

RDEPENDS:${PN} += "python-abi \
python311-future \
python311-six"

inherit rpm
