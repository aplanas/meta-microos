SUMMARY = "Linode DNS Authenticator plugin for Certbot"
DESCRIPTION = "This certbot plugin automates the process of completing an ACME \
dns-01 challenge by creating, and subsequently removing, TXT \
records using Linode's DNS API."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python310-certbot-dns-linode-1.31.0-1.4.noarch.rpm"
RPM_HASH = "acdf7e79966fcd210370f96be2b6f3693d1ed1b1b073e2c0920fbe0ce66c85e5e4e93f85f24e655b3067e762d9b596210bc2cd9187527f9f1a9bb9a5912147a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-linode \
python3.10dist(certbot-dns-linode) \
python310-certbot-dns-linode \
python3dist(certbot-dns-linode)"

RDEPENDS:${PN} += "python(abi) \
python310-acme \
python310-certbot \
python310-dns-lexicon"

inherit rpm
