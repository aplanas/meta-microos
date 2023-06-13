SUMMARY = "Python class for using nmap from Python 3"
DESCRIPTION = "This is a Python class for using nmap and accessing scan results from Python 3."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.1"

RPM_NAME = "python311-python-nmap-0.6.1-2.14.noarch.rpm"
RPM_HASH = "05daeb8cea277e6eaaf82c3026b346f08b929d701fa6203d8eb13fa40c53ccfde92cadcafe26cb5a72224dfdf29bf830d9f3c4dc371e6918426f87b9a9af5378"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-nmap) \
python311-python-nmap \
python3dist(python-nmap)"

RDEPENDS:${PN} += "nmap \
python(abi)"

inherit rpm
