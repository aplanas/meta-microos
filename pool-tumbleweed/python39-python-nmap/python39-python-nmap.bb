SUMMARY = "Python class for using nmap from Python 3"
DESCRIPTION = "This is a Python class for using nmap and accessing scan results from Python 3."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.1"

RPM_NAME = "python39-python-nmap-0.6.1-2.15.noarch.rpm"
RPM_HASH = "fd7f7eaa9dba49487587dbe7d98388d03e853a8b10e3e70bd2e27470b88b4900cf54272c6d6bf6c2918a552869f11728ede5e490cd49186e6fc9a5b2eb5fb7be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-nmap \
python39-python-nmap \
python3dist-python-nmap"

RDEPENDS:${PN} += "nmap \
python-abi"

inherit rpm
