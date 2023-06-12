SUMMARY = "A mock implementation of python-ldap"
DESCRIPTION = "Grab is a Python web scraping framework. Grab provides a number of \
methods to perform network requests, scrape web sites and process the scraped \
content."
LICENSE = "MIT"

PV = "0.6.41"

RPM_NAME = "python39-grab-0.6.41-1.17.noarch.rpm"
RPM_HASH = "1663f5696ccd15d7acab30ecda72ed545e5deb75c0d38744ba62142c425f94aa7ca6bc9371210988aa536f1357856dd09fd382ba88d2421c9985ad2fa2b7d517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(grab) \
python39-grab \
python3dist(grab)"
RDEPENDS:${PN} += "python(abi) \
python39-defusedxml \
python39-lxml \
python39-pycurl \
python39-selection \
python39-six \
python39-user_agent \
python39-weblib"

inherit rpm
