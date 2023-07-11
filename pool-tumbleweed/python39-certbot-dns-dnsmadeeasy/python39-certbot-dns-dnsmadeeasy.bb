SUMMARY = "DNS Made Easy Authenticator plugin for Certbot"
DESCRIPTION = "Dns Made Easy DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python39-certbot-dns-dnsmadeeasy-2.6.0-1.3.noarch.rpm"
RPM_HASH = "b4e009c7af123348271036bcf3dda5338020d9a237de9c054c960ad5fc8f971a0e20433fd2e92974b21183bde35ab8e24b6bfd4a77196c65c97d7d2182cde220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-certbot-dns-dnsmadeeasy \
python39-certbot-dns-dnsmadeeasy \
python3dist-certbot-dns-dnsmadeeasy"

RDEPENDS:${PN} += "python-abi \
python39-acme \
python39-certbot \
python39-dns-lexicon"

inherit rpm
