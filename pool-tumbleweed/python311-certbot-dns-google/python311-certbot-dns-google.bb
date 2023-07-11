SUMMARY = "Google Cloud Authenticator plugin for Certbot"
DESCRIPTION = "Google Cloud DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python311-certbot-dns-google-2.6.0-1.3.noarch.rpm"
RPM_HASH = "fbbec60ed04571583e2f95b896a617d9f2979574a31ebe6c5cd56e26f9162587e3839044cf9de24816b167f3b4bfdff4885dcdcc227c47bf043d822b926a3ae1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-google \
python3.11dist-certbot-dns-google \
python311-certbot-dns-google \
python3dist-certbot-dns-google"

RDEPENDS:${PN} += "python-abi \
python311-acme \
python311-certbot \
python311-google-api-python-client \
python311-google-auth"

inherit rpm
