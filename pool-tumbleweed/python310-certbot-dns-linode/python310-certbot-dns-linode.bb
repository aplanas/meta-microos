SUMMARY = "Linode DNS Authenticator plugin for Certbot"
DESCRIPTION = "This certbot plugin automates the process of completing an ACME \
dns-01 challenge by creating, and subsequently removing, TXT \
records using Linode's DNS API."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python310-certbot-dns-linode-2.6.0-1.3.noarch.rpm"
RPM_HASH = "81e040fdbe1ce1b26994629ebb21f0626fda9af9ad5c2ae6b3e675ddee46fe3417eb81773be0858f704dbdb627d277342bc73b8074495d3be5ed72575e36c96b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-certbot-dns-linode \
python310-certbot-dns-linode \
python3dist-certbot-dns-linode"

RDEPENDS:${PN} += "python-abi \
python310-acme \
python310-certbot \
python310-dns-lexicon"

inherit rpm
