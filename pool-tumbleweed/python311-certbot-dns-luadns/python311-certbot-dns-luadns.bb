SUMMARY = "LuaDNS Authenticator plugin for Certbot"
DESCRIPTION = "LuaDNS DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python311-certbot-dns-luadns-1.31.0-1.4.noarch.rpm"
RPM_HASH = "7f9097e0fcd03970185faca681da5ecc9d5b2a6c7de4aca95652b84a674ca443bcecf12e4ad2819b6a9a6eba265fdaf798caeafe3c1bd0a5aa6a74832e9a57df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(certbot-dns-luadns) \
python311-certbot-dns-luadns \
python3dist(certbot-dns-luadns)"

RDEPENDS:${PN} += "python(abi) \
python311-acme \
python311-certbot \
python311-dns-lexicon"

inherit rpm
