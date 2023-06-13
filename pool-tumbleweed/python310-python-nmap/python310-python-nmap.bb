SUMMARY = "Python class for using nmap from Python 3"
DESCRIPTION = "This is a Python class for using nmap and accessing scan results from Python 3."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.1"

RPM_NAME = "python310-python-nmap-0.6.1-2.14.noarch.rpm"
RPM_HASH = "5b9a25542e23b6795c31d67c66ff8b53054fbe89794dc2797093d6d5596f0f8d05f4d61854b6875606d8a40d072431741ef2a78d71764ea37536e738bb5f7601"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-nmap \
python3.10dist(python-nmap) \
python310-python-nmap \
python3dist(python-nmap)"

RDEPENDS:${PN} += "nmap \
python(abi)"

inherit rpm
