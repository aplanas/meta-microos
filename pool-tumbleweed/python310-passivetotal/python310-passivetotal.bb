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

RPM_NAME = "python310-passivetotal-2.5.9-1.7.noarch.rpm"
RPM_HASH = "e55fa4210780e42ef95c1d9facfa65171bffd2fa563932a61b8685e9e834c7e778b64f3fecf73fe834cc5384d2b95cac9db05675ea19d8a572f4aeb576bc7f53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-passivetotal \
python3.10dist-passivetotal \
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
