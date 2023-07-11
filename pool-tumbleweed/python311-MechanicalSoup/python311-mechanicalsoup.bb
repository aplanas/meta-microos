SUMMARY = "A Python library for automating interaction with websites"
DESCRIPTION = "A Python library for automating interaction with websites. \
MechanicalSoup automatically stores and sends cookies, \
follows redirects, and can follow links and submit forms. \
It doesn't do Javascript. \
 \
The Mechanize library is incompatible with Python 3 and development \
is inactive. MechanicalSoup provides a similar API to it, built on \
Python giants Requests (for http sessions) and BeautifulSoup (for \
document navigation)."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-MechanicalSoup-1.2.0-2.4.noarch.rpm"
RPM_HASH = "2a4fefcc6f932c63fee68d2bbeb249884d7cb95cd0f36bc3ee125729b19793a9f945fa5ef6f12267aa824d0fee49729559799e8687e3b2d9f5c3e240399a34a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-MechanicalSoup \
python3.11dist-mechanicalsoup \
python311-MechanicalSoup \
python3dist-mechanicalsoup"

RDEPENDS:${PN} += "python-abi \
python311-beautifulsoup4 \
python311-lxml \
python311-requests"

inherit rpm
