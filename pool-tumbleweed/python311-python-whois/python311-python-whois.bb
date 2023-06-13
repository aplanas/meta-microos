SUMMARY = "Whois querying and parsing of domain registration information"
DESCRIPTION = "A simple importable Python module which will produce parsed WHOIS data for a given domain. \
Able to extract data for all the popular TLDs (com, org, net, ...) \
Query a WHOIS server directly instead of going through an intermediate web service like many others do."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python311-python-whois-0.8.0-1.3.noarch.rpm"
RPM_HASH = "191e121e02e5cb3230873e210e37fe654c7146edeb1dff4103a9e6be5e62cf1ea285b1bc00a267dd7ed25747b7e88c015218fea46e8a7b08975f382dd4c5ef9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-whois) \
python311-python-whois \
python3dist(python-whois)"

RDEPENDS:${PN} += "python(abi) \
python311-future"

inherit rpm
