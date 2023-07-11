SUMMARY = "DNS Made Easy Authenticator plugin for Certbot"
DESCRIPTION = "Dns Made Easy DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python311-certbot-dns-dnsmadeeasy-2.6.0-1.3.noarch.rpm"
RPM_HASH = "e27b939b35b31ac416448e08cc01869168dc80f2ac8f39bc9b734840a25f674a74ef5a5d1a083f6d9d81cb4f98007c60524639e60fdd4b7d1c9cc9c27c37838c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-dnsmadeeasy \
python3.11dist-certbot-dns-dnsmadeeasy \
python311-certbot-dns-dnsmadeeasy \
python3dist-certbot-dns-dnsmadeeasy"

RDEPENDS:${PN} += "python-abi \
python311-acme \
python311-certbot \
python311-dns-lexicon"

inherit rpm
