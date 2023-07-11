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

RPM_NAME = "python39-passivetotal-2.5.9-1.9.noarch.rpm"
RPM_HASH = "8e3c199703c310dbe6e3103f45080a3ae842a4d6045897b34026da0e9ac7e5dc74f544e21d3d6143d3300ed4983354adca6043bc4b02ba16fb9a33ad4994c721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-passivetotal \
python39-passivetotal \
python3dist-passivetotal"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-ez-setup \
python39-future \
python39-python-dateutil \
python39-requests \
python39-tldextract \
update-alternatives"

inherit rpm
