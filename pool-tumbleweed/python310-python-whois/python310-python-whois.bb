SUMMARY = "Whois querying and parsing of domain registration information"
DESCRIPTION = "A simple importable Python module which will produce parsed WHOIS data for a given domain. \
Able to extract data for all the popular TLDs (com, org, net, ...) \
Query a WHOIS server directly instead of going through an intermediate web service like many others do."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python310-python-whois-0.8.0-1.3.noarch.rpm"
RPM_HASH = "065a0a6614400f9600a0429e1ea1de3d00096c77c2283f37f164bff2ff80272b569886a409ae160bc16f483804fe34dedf13b92c3c1c3949193cb669c94ec4e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-whois \
python3.10dist-python-whois \
python310-python-whois \
python3dist-python-whois"

RDEPENDS:${PN} += "python-abi \
python310-future"

inherit rpm
