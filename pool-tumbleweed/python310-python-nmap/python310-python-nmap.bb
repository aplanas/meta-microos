SUMMARY = "Python class for using nmap from Python 3"
DESCRIPTION = "This is a Python class for using nmap and accessing scan results from Python 3."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.1"

RPM_NAME = "python310-python-nmap-0.6.1-2.15.noarch.rpm"
RPM_HASH = "17fccf78d472aa89bd316037f2129c925cfd2089c60e0dfd7caf9963f8aaf12570606274645bc6ecdc738200fd2269e7851fd3e7e09c44767661ce98b36ae113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-nmap \
python310-python-nmap \
python3dist-python-nmap"

RDEPENDS:${PN} += "nmap \
python-abi"

inherit rpm
