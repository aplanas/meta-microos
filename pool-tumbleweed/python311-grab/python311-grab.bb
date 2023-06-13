SUMMARY = "A mock implementation of python-ldap"
DESCRIPTION = "Grab is a Python web scraping framework. Grab provides a number of \
methods to perform network requests, scrape web sites and process the scraped \
content."
LICENSE = "MIT"

PV = "0.6.41"

RPM_NAME = "python311-grab-0.6.41-1.17.noarch.rpm"
RPM_HASH = "1c7810cdb34c62d36b77dfb7223dc50db4332b6ba2fe123258b16f0590391e1aa7384f46dfec344cfc5fc0434f56d4f846919f3a7564b0ac718c46f271fc5f73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(grab) \
python311-grab \
python3dist(grab)"

RDEPENDS:${PN} += "python(abi) \
python311-defusedxml \
python311-lxml \
python311-pycurl \
python311-selection \
python311-six \
python311-user_agent \
python311-weblib"

inherit rpm
