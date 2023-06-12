SUMMARY = "Nginx plugin for Certbot"
DESCRIPTION = "The Nginx plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python311-certbot-nginx-1.31.0-1.3.noarch.rpm"
RPM_HASH = "1ac1450c7ec8f942973268039571a2193a05ce6513310d84ff6bd63e342a96a3487c580f8e6b34a0570abacb0e7da406082595a1b81a0295254ffc35234de1f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(certbot-nginx) \
python311-certbot-nginx \
python3dist(certbot-nginx)"
RDEPENDS:${PN} += "nginx \
python(abi) \
python311-acme \
python311-certbot \
python311-pyOpenSSL \
python311-pyparsing"

inherit rpm
