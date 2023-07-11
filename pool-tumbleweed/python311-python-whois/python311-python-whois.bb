SUMMARY = "Whois querying and parsing of domain registration information"
DESCRIPTION = "A simple importable Python module which will produce parsed WHOIS data for a given domain. \
Able to extract data for all the popular TLDs (com, org, net, ...) \
Query a WHOIS server directly instead of going through an intermediate web service like many others do."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python311-python-whois-0.8.0-1.5.noarch.rpm"
RPM_HASH = "a41bac40788fd7331d074d752fb3a1122cb09b6e10449cd8389c8879d94ee94d79aba8cb7630fa16c2a07ee1c0a02811cd6c964faf51c1f62aecd09901e0ee18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-whois \
python3.11dist-python-whois \
python311-python-whois \
python3dist-python-whois"

RDEPENDS:${PN} += "python-abi \
python311-future"

inherit rpm
