SUMMARY = "Cloudflare Authenticator plugin for Certbot"
DESCRIPTION = "Cloudflare DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python311-certbot-dns-cloudflare-2.6.0-1.3.noarch.rpm"
RPM_HASH = "03e76085d51b077493f65e80587fc867f48118c6a2b5d27295fbbe4ce7bccb42f1a768d1f3b1f75bbf2a9c65511a4070a17ff7571172cc558c35cfcc1f7ed37d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-cloudflare \
python3.11dist-certbot-dns-cloudflare \
python311-certbot-dns-cloudflare \
python3dist-certbot-dns-cloudflare"

RDEPENDS:${PN} += "python-abi \
python311-acme \
python311-certbot \
python311-cloudflare"

inherit rpm
