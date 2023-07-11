SUMMARY = "Whois querying and parsing of domain registration information"
DESCRIPTION = "A simple importable Python module which will produce parsed WHOIS data for a given domain. \
Able to extract data for all the popular TLDs (com, org, net, ...) \
Query a WHOIS server directly instead of going through an intermediate web service like many others do."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python39-python-whois-0.8.0-1.5.noarch.rpm"
RPM_HASH = "98506dd4b1faa13a6c91df5bf6457fd31c8db8d9cd70c8d1c43d9be14aeae339f7deb4ac31bcfef42cf5528c718242273bd2f88eec37a7ff630517912e8a1e87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-whois \
python39-python-whois \
python3dist-python-whois"

RDEPENDS:${PN} += "python-abi \
python39-future"

inherit rpm
