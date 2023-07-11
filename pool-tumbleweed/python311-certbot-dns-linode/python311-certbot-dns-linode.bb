SUMMARY = "Linode DNS Authenticator plugin for Certbot"
DESCRIPTION = "This certbot plugin automates the process of completing an ACME \
dns-01 challenge by creating, and subsequently removing, TXT \
records using Linode's DNS API."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python311-certbot-dns-linode-2.6.0-1.3.noarch.rpm"
RPM_HASH = "ebbd92502453af674e8094c6f174f9cf9ef2201f85d98119dd6b14e9b4760b04ab376e81e182a452fccf240f083ab6bbb6102376f4214aa89fc81255a501a939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-linode \
python3.11dist-certbot-dns-linode \
python311-certbot-dns-linode \
python3dist-certbot-dns-linode"

RDEPENDS:${PN} += "python-abi \
python311-acme \
python311-certbot \
python311-dns-lexicon"

inherit rpm
