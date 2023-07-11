SUMMARY = "Cloudflare Authenticator plugin for Certbot"
DESCRIPTION = "Cloudflare DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python310-certbot-dns-cloudflare-2.6.0-1.3.noarch.rpm"
RPM_HASH = "cf9d8a8c29c0537d3bc808314d42c79fbe72e0399d846715948aaaeefb9d1c2f75b2958935079d2e9a924003b81bc165e62cd65df0195446f20d997d3edd9d76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-certbot-dns-cloudflare \
python310-certbot-dns-cloudflare \
python3dist-certbot-dns-cloudflare"

RDEPENDS:${PN} += "python-abi \
python310-acme \
python310-certbot \
python310-cloudflare"

inherit rpm
