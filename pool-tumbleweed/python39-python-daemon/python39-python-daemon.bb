SUMMARY = "Library to implement a well-behaved Unix daemon process"
DESCRIPTION = "This library implements the well-behaved daemon specification of PEP 3143, 'Standard daemon \
process library'. \
 \
A well-behaved Unix daemon process is tricky to get right, but the required steps are much the \
same for every daemon program. A DaemonContext instance holds the behaviour and configured \
process environment for the program; use the instance as a context manager to enter a daemon state."
LICENSE = "Apache-2.0 & GPL-3.0-only"

PV = "2.3.2"

RPM_NAME = "python39-python-daemon-2.3.2-2.3.noarch.rpm"
RPM_HASH = "0b6c05a7d8aff5b00aee473ec07e96dd4369850796cfca86801be31d448a704b141b2b30b20e14f7a79948f9707eaf36c2255ed4279dd4b2f6fe9dbabfba7271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-daemon \
python39-python-daemon \
python3dist-python-daemon"

RDEPENDS:${PN} += "python-abi \
python39-lockfile"

inherit rpm
