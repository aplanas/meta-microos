SUMMARY = "Python module for parsing semi-structured text into python tables"
DESCRIPTION = "Python module which implements a template based state machine for parsing \
semi-formatted text. Originally developed to allow programmatic access to \
information returned from the command line interface (CLI) of networking \
devices."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "python310-textfsm-1.1.3-1.8.noarch.rpm"
RPM_HASH = "3a7839f7e373fc3204170c842ae864534e0fc2f7f5d46cf60050f1549adcd351598e2e0eafc233022ae68b21e9b17e78cfe3670b138de8483d6e808864bb5f76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-textfsm \
python310-textfsm \
python3dist-textfsm"

RDEPENDS:${PN} += "python-abi \
python310-future \
python310-six"

inherit rpm
