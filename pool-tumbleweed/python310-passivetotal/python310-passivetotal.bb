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

RPM_NAME = "python310-passivetotal-2.5.9-1.9.noarch.rpm"
RPM_HASH = "49030aba1014b7ea4004ecc255c77e473c40c1d8a8ad6939cb8a27a6165856379af8313c1de2df4c92aacbc184e012ae1935898388d179322491ed4d72e57d52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-passivetotal \
python310-passivetotal \
python3dist-passivetotal"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-ez-setup \
python310-future \
python310-python-dateutil \
python310-requests \
python310-tldextract \
update-alternatives"

inherit rpm
