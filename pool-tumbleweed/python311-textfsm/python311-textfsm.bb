SUMMARY = "Python module for parsing semi-structured text into python tables"
DESCRIPTION = "Python module which implements a template based state machine for parsing \
semi-formatted text. Originally developed to allow programmatic access to \
information returned from the command line interface (CLI) of networking \
devices."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "python311-textfsm-1.1.3-1.6.noarch.rpm"
RPM_HASH = "b4f29bdd9dccffdc91ca1e08ed7e08fc882d673c977095d8b87991fa9fdc4a4fac56c1c8decf493cbf05f5bd3e0d95dae7fc64cc2ad763b7cfab54df39ca30dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(textfsm) \
python311-textfsm \
python3dist(textfsm)"

RDEPENDS:${PN} += "python(abi) \
python311-future \
python311-six"

inherit rpm
