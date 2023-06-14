SUMMARY = "Library to implement a well-behaved Unix daemon process"
DESCRIPTION = "This library implements the well-behaved daemon specification of PEP 3143, 'Standard daemon \
process library'. \
 \
A well-behaved Unix daemon process is tricky to get right, but the required steps are much the \
same for every daemon program. A DaemonContext instance holds the behaviour and configured \
process environment for the program; use the instance as a context manager to enter a daemon state."
LICENSE = "Apache-2.0 & GPL-3.0-only"

PV = "2.3.2"

RPM_NAME = "python39-python-daemon-2.3.2-2.1.noarch.rpm"
RPM_HASH = "b7227abd02e802c1e88e276dd6465be3ea55667f19f1bb2b6fb981a8f40cd1fe03e8c75c8fef1e2d83c4672418b28dddf410d182ef58cd2b52cf4b84b24f70d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-daemon \
python39-python-daemon \
python3dist-python-daemon"

RDEPENDS:${PN} += "python-abi \
python39-lockfile"

inherit rpm
