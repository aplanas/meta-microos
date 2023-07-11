SUMMARY = "Library to implement a well-behaved Unix daemon process"
DESCRIPTION = "This library implements the well-behaved daemon specification of PEP 3143, 'Standard daemon \
process library'. \
 \
A well-behaved Unix daemon process is tricky to get right, but the required steps are much the \
same for every daemon program. A DaemonContext instance holds the behaviour and configured \
process environment for the program; use the instance as a context manager to enter a daemon state."
LICENSE = "Apache-2.0 & GPL-3.0-only"

PV = "2.3.2"

RPM_NAME = "python310-python-daemon-2.3.2-2.3.noarch.rpm"
RPM_HASH = "0c62ab0fcfb4a0d174032b2b0b3775202b8e5aa4abe338336eb559f0d0d60d15bf71a71b2a3ba9083dfcdb405bcc1cafe5949a543b6870b0f6ccb19593231643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-daemon \
python310-python-daemon \
python3dist-python-daemon"

RDEPENDS:${PN} += "python-abi \
python310-lockfile"

inherit rpm
