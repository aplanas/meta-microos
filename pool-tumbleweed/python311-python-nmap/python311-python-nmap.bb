SUMMARY = "Python class for using nmap from Python 3"
DESCRIPTION = "This is a Python class for using nmap and accessing scan results from Python 3."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.1"

RPM_NAME = "python311-python-nmap-0.6.1-2.15.noarch.rpm"
RPM_HASH = "7d9f7ffeb028067cdb5b4021d786bea53da4bdf29b79a8c0c3ecf9eeb7c4b705eee5161af8c6e48c172f5a037918a046ed081c5f24f0bf3fed763aa3620aee7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-nmap \
python3.11dist-python-nmap \
python311-python-nmap \
python3dist-python-nmap"

RDEPENDS:${PN} += "nmap \
python-abi"

inherit rpm
