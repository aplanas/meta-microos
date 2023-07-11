SUMMARY = "LuaDNS Authenticator plugin for Certbot"
DESCRIPTION = "LuaDNS DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python39-certbot-dns-luadns-2.6.0-1.3.noarch.rpm"
RPM_HASH = "5a051f41584ffb57b41a598f123e63150b680a620ca621fc1941ee3d139b660200473411b9d2a0f31224953f3349fa2c3b6d4148b9d99d845d222d4c0c979dec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-certbot-dns-luadns \
python39-certbot-dns-luadns \
python3dist-certbot-dns-luadns"

RDEPENDS:${PN} += "python-abi \
python39-acme \
python39-certbot \
python39-dns-lexicon"

inherit rpm
