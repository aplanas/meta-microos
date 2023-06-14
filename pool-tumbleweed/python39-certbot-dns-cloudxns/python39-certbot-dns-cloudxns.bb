SUMMARY = "CloudXNS Authenticator plugin for Certbot"
DESCRIPTION = "CloudXNS DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python39-certbot-dns-cloudxns-1.31.0-1.4.noarch.rpm"
RPM_HASH = "801ecd95f5980d8cb5113a7242590c11611183f43e7c199448912bbe1d3d059848dc83e4229caf346f5076994670293aa0b8dc689cf226ce802e44756150d65f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-certbot-dns-cloudxns \
python39-certbot-dns-cloudxns \
python3dist-certbot-dns-cloudxns"

RDEPENDS:${PN} += "python-abi \
python39-acme \
python39-certbot \
python39-dns-lexicon \
python39-zope.interface"

inherit rpm
