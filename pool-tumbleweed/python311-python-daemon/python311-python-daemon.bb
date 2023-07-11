SUMMARY = "Library to implement a well-behaved Unix daemon process"
DESCRIPTION = "This library implements the well-behaved daemon specification of PEP 3143, 'Standard daemon \
process library'. \
 \
A well-behaved Unix daemon process is tricky to get right, but the required steps are much the \
same for every daemon program. A DaemonContext instance holds the behaviour and configured \
process environment for the program; use the instance as a context manager to enter a daemon state."
LICENSE = "Apache-2.0 & GPL-3.0-only"

PV = "2.3.2"

RPM_NAME = "python311-python-daemon-2.3.2-2.3.noarch.rpm"
RPM_HASH = "62ec8e9504bd8d1a3b79351a2841beee710982b534b0bc77bf4d1caf7c5e3eae02b72116f9b5e3013cee4c0a559572f04c7deff970bc1099ad27e21779a26353"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-daemon \
python3.11dist-python-daemon \
python311-python-daemon \
python3dist-python-daemon"

RDEPENDS:${PN} += "python-abi \
python311-lockfile"

inherit rpm
