SUMMARY = "DNS Made Easy Authenticator plugin for Certbot"
DESCRIPTION = "Dns Made Easy DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python310-certbot-dns-dnsmadeeasy-1.31.0-1.4.noarch.rpm"
RPM_HASH = "2ce9e7b2e152aebcc7351c553ba1c9b46db385c5291eeeb3db797d50b8244d3da6d18be1884b083561a5f296c63de4c3f334be47c0b4993a7e334a326421a702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-dnsmadeeasy \
python3.10dist-certbot-dns-dnsmadeeasy \
python310-certbot-dns-dnsmadeeasy \
python3dist-certbot-dns-dnsmadeeasy"

RDEPENDS:${PN} += "python-abi \
python310-acme \
python310-certbot \
python310-dns-lexicon \
python310-zope.interface"

inherit rpm
