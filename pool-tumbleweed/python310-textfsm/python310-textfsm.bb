SUMMARY = "Python module for parsing semi-structured text into python tables"
DESCRIPTION = "Python module which implements a template based state machine for parsing \
semi-formatted text. Originally developed to allow programmatic access to \
information returned from the command line interface (CLI) of networking \
devices."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "python310-textfsm-1.1.3-1.6.noarch.rpm"
RPM_HASH = "8148450ad0b83d416169dc2bf2a4da701cd1eb2d4e04f71732b7562266c353ae078871dec2bf608dff35a3ad465504fa007500123d65b05836852b8935356b00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-textfsm \
python3.10dist-textfsm \
python310-textfsm \
python3dist-textfsm"

RDEPENDS:${PN} += "python-abi \
python310-future \
python310-six"

inherit rpm
