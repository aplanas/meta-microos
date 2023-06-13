SUMMARY = "Library to implement a well-behaved Unix daemon process"
DESCRIPTION = "This library implements the well-behaved daemon specification of PEP 3143, 'Standard daemon \
process library'. \
 \
A well-behaved Unix daemon process is tricky to get right, but the required steps are much the \
same for every daemon program. A DaemonContext instance holds the behaviour and configured \
process environment for the program; use the instance as a context manager to enter a daemon state."
LICENSE = "Apache-2.0 & GPL-3.0-only"

PV = "2.3.2"

RPM_NAME = "python311-python-daemon-2.3.2-2.1.noarch.rpm"
RPM_HASH = "ba0ab03443d688640ea8f26c3d2ec2e45512ea56e89ac9b483b77431b490c6f98ce96ac532b502e201cfaf47b2a9496e462f3cf81d2ccefc6dd5f1cd8e4c2286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-daemon) \
python311-python-daemon \
python3dist(python-daemon)"

RDEPENDS:${PN} += "python(abi) \
python311-lockfile"

inherit rpm
