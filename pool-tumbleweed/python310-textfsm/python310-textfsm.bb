SUMMARY = "Python module for parsing semi-structured text into python tables"
DESCRIPTION = "Python module which implements a template based state machine for parsing \
semi-formatted text. Originally developed to allow programmatic access to \
information returned from the command line interface (CLI) of networking \
devices."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "python310-textfsm-1.1.3-3.1.noarch.rpm"
RPM_HASH = "3ce610bd3add0d75b140dfafa0d00380cfd89561072bd00887b1e9ebc4e120a3d991215c67c65b85164240a03df0dfaf15c2aed9285aeaa31b6a7b13ec9b94ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-textfsm \
python310-textfsm \
python3dist-textfsm"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
