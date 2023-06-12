SUMMARY = "LuaDNS Authenticator plugin for Certbot"
DESCRIPTION = "LuaDNS DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python39-certbot-dns-luadns-1.31.0-1.4.noarch.rpm"
RPM_HASH = "b2d493481599cf87d17bb3a65a35fc335e9b0b50ed0130ba3d1242d52585ddab9c42c3410699bc4cb59339fbeea9f46dd32ef40dd8d4bc5b558fecf2d31c788f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(certbot-dns-luadns) \
python39-certbot-dns-luadns \
python3dist(certbot-dns-luadns)"
RDEPENDS:${PN} += "python(abi) \
python39-acme \
python39-certbot \
python39-dns-lexicon"

inherit rpm
