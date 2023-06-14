SUMMARY = "DNS Made Easy Authenticator plugin for Certbot"
DESCRIPTION = "Dns Made Easy DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python39-certbot-dns-dnsmadeeasy-1.31.0-1.4.noarch.rpm"
RPM_HASH = "31c9ab52ec892240045ed139d96763bd8b6be955d10445ca980029b26d60abc7dce4ad0fb99d9293a136aa481942288242e7be7ed3118edd6122f12099413cec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-certbot-dns-dnsmadeeasy \
python39-certbot-dns-dnsmadeeasy \
python3dist-certbot-dns-dnsmadeeasy"

RDEPENDS:${PN} += "python-abi \
python39-acme \
python39-certbot \
python39-dns-lexicon \
python39-zope.interface"

inherit rpm
