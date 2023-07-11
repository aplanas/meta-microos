SUMMARY = "Whois querying and parsing of domain registration information"
DESCRIPTION = "A simple importable Python module which will produce parsed WHOIS data for a given domain. \
Able to extract data for all the popular TLDs (com, org, net, ...) \
Query a WHOIS server directly instead of going through an intermediate web service like many others do."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python310-python-whois-0.8.0-1.5.noarch.rpm"
RPM_HASH = "a916db97d6c61b1642baab37dc97e6efe753cd443b63d8708a4afd4884192bd74d11cbae2e9c258b27483b487741560e1dacc908cd6a7942796be8ba8a23baf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-whois \
python310-python-whois \
python3dist-python-whois"

RDEPENDS:${PN} += "python-abi \
python310-future"

inherit rpm
