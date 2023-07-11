SUMMARY = "Client for the PassiveTotal REST API"
DESCRIPTION = "Passivetotal provides a Python client library implementation into RiskIQ API \
services. The library currently provides support for the following services: \
 \
- Passive DNS queries and filters \
- WHOIS queries (search and details) \
- SSL Certificates (search and details) \
- Account configuration \
- Site actions (tagging, classifying, etc.)"
LICENSE = "GPL-2.0-only"

PV = "2.5.9"

RPM_NAME = "python311-passivetotal-2.5.9-1.9.noarch.rpm"
RPM_HASH = "d5b0bc0e7a7ea1a5c795398f361025b5264b81d8ac04e91a58f624284b6bc5226b114bd6d7de3e7b641ad055d1a5f337088919a11ac8f5f8b154f5f916b7c6ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-passivetotal \
python3.11dist-passivetotal \
python311-passivetotal \
python3dist-passivetotal"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-ez-setup \
python311-future \
python311-python-dateutil \
python311-requests \
python311-tldextract \
update-alternatives"

inherit rpm
