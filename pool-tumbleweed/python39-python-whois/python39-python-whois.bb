SUMMARY = "Whois querying and parsing of domain registration information"
DESCRIPTION = "A simple importable Python module which will produce parsed WHOIS data for a given domain. \
Able to extract data for all the popular TLDs (com, org, net, ...) \
Query a WHOIS server directly instead of going through an intermediate web service like many others do."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python39-python-whois-0.8.0-1.3.noarch.rpm"
RPM_HASH = "648ae9ff80d1926ad5e4f3e94dd6257bcc00a2f291084e5107aa361ebebf7fb0e76162669985fbffdcd6e6b9a88984c343b883096e836df2695394019e323d10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-whois) \
python39-python-whois \
python3dist(python-whois)"
RDEPENDS:${PN} += "python(abi) \
python39-future"

inherit rpm
