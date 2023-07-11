SUMMARY = "Friendly state machines for python"
DESCRIPTION = "Friendly state machines for python. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python3-automaton-3.1.0-1.3.noarch.rpm"
RPM_HASH = "e866d5fd303921364bb4149f15871f6babb6aa62962ba16924793a6a2ee2053a8dba86cf4affe560c663137f02c9f7702b2af1709a11111dfac424ba53518832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-automaton \
python3.11dist-automaton \
python3dist-automaton"

RDEPENDS:${PN} += "python-abi \
python3-PrettyTable \
python3-pbr \
python3-six"

inherit rpm
