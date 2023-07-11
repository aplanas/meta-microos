SUMMARY = "Python module for parsing semi-structured text into python tables"
DESCRIPTION = "Python module which implements a template based state machine for parsing \
semi-formatted text. Originally developed to allow programmatic access to \
information returned from the command line interface (CLI) of networking \
devices."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "python311-textfsm-1.1.3-1.8.noarch.rpm"
RPM_HASH = "a8ff6fb586b7fdd41123207f249cdd0d84baf41fa986399e091e638f277e7e49e5c66a174808a276737f8ea47e81bb1ea1746974f0abe1b09b41fa884cbb90ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-textfsm \
python3.11dist-textfsm \
python311-textfsm \
python3dist-textfsm"

RDEPENDS:${PN} += "python-abi \
python311-future \
python311-six"

inherit rpm
