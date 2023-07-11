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

RPM_NAME = "python39-MechanicalSoup-1.2.0-2.4.noarch.rpm"
RPM_HASH = "b97424c2b5e4f07d057c020cea4abb4ce93da34f51f0ef5a43127960c06babb6c6cde85492df2df9900e9bd2fa294ee7d2f9414698b6c4e8302bfad7b9750ff3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mechanicalsoup \
python39-MechanicalSoup \
python3dist-mechanicalsoup"

RDEPENDS:${PN} += "python-abi \
python39-beautifulsoup4 \
python39-lxml \
python39-requests"

inherit rpm
