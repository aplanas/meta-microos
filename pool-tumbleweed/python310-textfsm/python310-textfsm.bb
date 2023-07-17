SUMMARY = "Python module for parsing semi-structured text into python tables"
DESCRIPTION = "Python module which implements a template based state machine for parsing \
semi-formatted text. Originally developed to allow programmatic access to \
information returned from the command line interface (CLI) of networking \
devices."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "python310-textfsm-1.1.3-2.1.noarch.rpm"
RPM_HASH = "cc543c6b40a92194755946824b5f66a7871c0ded0fb0a51c215140286732261398d936e5bfcff967c9ae853a71d95bfa2aa6fa5614dba8f3b0d78c37c3f8abfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-textfsm \
python310-textfsm \
python3dist-textfsm"

RDEPENDS:${PN} += "python-abi \
python310-future \
python310-six"

inherit rpm
