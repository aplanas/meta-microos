SUMMARY = "DNS Made Easy Authenticator plugin for Certbot"
DESCRIPTION = "Dns Made Easy DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python310-certbot-dns-dnsmadeeasy-2.6.0-1.3.noarch.rpm"
RPM_HASH = "d13bf189853219710acdac797535d61ae4bc4723126bd2270fb408c6bb0dee66a6471732652f01b19993f63179bcdca80c9b799cf3522242688f3eb605176307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-certbot-dns-dnsmadeeasy \
python310-certbot-dns-dnsmadeeasy \
python3dist-certbot-dns-dnsmadeeasy"

RDEPENDS:${PN} += "python-abi \
python310-acme \
python310-certbot \
python310-dns-lexicon"

inherit rpm
