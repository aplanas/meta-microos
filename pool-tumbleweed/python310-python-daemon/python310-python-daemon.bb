SUMMARY = "Library to implement a well-behaved Unix daemon process"
DESCRIPTION = "This library implements the well-behaved daemon specification of PEP 3143, 'Standard daemon \
process library'. \
 \
A well-behaved Unix daemon process is tricky to get right, but the required steps are much the \
same for every daemon program. A DaemonContext instance holds the behaviour and configured \
process environment for the program; use the instance as a context manager to enter a daemon state."
LICENSE = "Apache-2.0 & GPL-3.0-only"

PV = "2.3.2"

RPM_NAME = "python310-python-daemon-2.3.2-2.1.noarch.rpm"
RPM_HASH = "03f12005286dd9b611b0ca4a60c5bc7532f7f9629516281b3ac453cf9095cb6ba811c98185e27cea96ee97acaa36ae194b313bb34b85672f573a71f67d05551f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-daemon \
python3.10dist-python-daemon \
python310-python-daemon \
python3dist-python-daemon"

RDEPENDS:${PN} += "python-abi \
python310-lockfile"

inherit rpm
