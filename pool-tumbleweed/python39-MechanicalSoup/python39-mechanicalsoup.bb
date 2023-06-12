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

RPM_NAME = "python39-MechanicalSoup-1.2.0-2.2.noarch.rpm"
RPM_HASH = "c48de6f4dbd2ac2b9c5513502d3bfcf99a6816d7b9bcc39445cf7d438c53c89d7fc9c3fe92c10f73a179fa1f80730356e73d3ca42a4bf8b4e2ef9b67d0815122"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mechanicalsoup) \
python39-MechanicalSoup \
python3dist(mechanicalsoup)"
RDEPENDS:${PN} += "python(abi) \
python39-beautifulsoup4 \
python39-lxml \
python39-requests"

inherit rpm
