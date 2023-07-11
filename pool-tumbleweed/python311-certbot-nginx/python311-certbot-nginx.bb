SUMMARY = "Nginx plugin for Certbot"
DESCRIPTION = "The Nginx plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python311-certbot-nginx-2.6.0-1.3.noarch.rpm"
RPM_HASH = "ad8ee082f5b7e8f84a23c6a5da40889d5997f9a066abe4cbb9db1a793b91ff1611e20205aae60ca21bf0eed55768ddae53c46ab662157b2ccec38e2485d0f7ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-nginx \
python3.11dist-certbot-nginx \
python311-certbot-nginx \
python3dist-certbot-nginx"

RDEPENDS:${PN} += "nginx \
python-abi \
python311-acme \
python311-certbot \
python311-pyOpenSSL \
python311-pyparsing"

inherit rpm
