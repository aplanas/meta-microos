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

RPM_NAME = "python310-MechanicalSoup-1.2.0-2.4.noarch.rpm"
RPM_HASH = "44853be34402ad4d3264c8169bc9800d6a57d43d15a04d12c92f30369d76857fa58ce69678231e6ccdad930dc0088e100c32eb30d86d85a31421a25ef1f3b877"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mechanicalsoup \
python310-MechanicalSoup \
python3dist-mechanicalsoup"

RDEPENDS:${PN} += "python-abi \
python310-beautifulsoup4 \
python310-lxml \
python310-requests"

inherit rpm
