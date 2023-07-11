SUMMARY = "Linode DNS Authenticator plugin for Certbot"
DESCRIPTION = "This certbot plugin automates the process of completing an ACME \
dns-01 challenge by creating, and subsequently removing, TXT \
records using Linode's DNS API."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python39-certbot-dns-linode-2.6.0-1.3.noarch.rpm"
RPM_HASH = "30c2d3b1d6cea11c68110c0330bc30d9626ed28a6fdd89a223022f4aeccea446e186582cca7fd41d2657b8112b1ee5fbd68ebc678ab90620f202e7fcc42ade41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-certbot-dns-linode \
python39-certbot-dns-linode \
python3dist-certbot-dns-linode"

RDEPENDS:${PN} += "python-abi \
python39-acme \
python39-certbot \
python39-dns-lexicon"

inherit rpm
