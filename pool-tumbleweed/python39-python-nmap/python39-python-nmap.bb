SUMMARY = "Python class for using nmap from Python 3"
DESCRIPTION = "This is a Python class for using nmap and accessing scan results from Python 3."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.1"

RPM_NAME = "python39-python-nmap-0.6.1-2.14.noarch.rpm"
RPM_HASH = "a8d084c041f4770a96d1bd3fb490e827bad5c0424cdcbc87e3b06787de1856f7f61dc52eece2aa98214aa7d39e6339f87bd00004a894553fb8ab754f109be68f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-nmap \
python39-python-nmap \
python3dist-python-nmap"

RDEPENDS:${PN} += "nmap \
python-abi"

inherit rpm
