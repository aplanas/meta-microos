SUMMARY = "Python module for parsing semi-structured text into python tables"
DESCRIPTION = "Python module which implements a template based state machine for parsing \
semi-formatted text. Originally developed to allow programmatic access to \
information returned from the command line interface (CLI) of networking \
devices."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "python311-textfsm-1.1.3-3.1.noarch.rpm"
RPM_HASH = "34122cf5330c79c0e6194d321e9ca62d7cbb69efcc7dfdec0818898740e84f3284992b36469132aa0e28dd923306f0b600b352143744021f179d6861c7fe73e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-textfsm \
python3.11dist-textfsm \
python311-textfsm \
python3dist-textfsm"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
