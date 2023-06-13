SUMMARY = "A mock implementation of python-ldap"
DESCRIPTION = "Grab is a Python web scraping framework. Grab provides a number of \
methods to perform network requests, scrape web sites and process the scraped \
content."
LICENSE = "MIT"

PV = "0.6.41"

RPM_NAME = "python310-grab-0.6.41-1.17.noarch.rpm"
RPM_HASH = "c8fbef504483b2712d3e69880716856607828c908f8128df4792c8ed8dfe6fb4508f237c223b9f34d4b7eb57649287d27ebc9f43b26ed43943421c21ba3c608a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-grab \
python3.10dist(grab) \
python310-grab \
python3dist(grab)"

RDEPENDS:${PN} += "python(abi) \
python310-defusedxml \
python310-lxml \
python310-pycurl \
python310-selection \
python310-six \
python310-user_agent \
python310-weblib"

inherit rpm
