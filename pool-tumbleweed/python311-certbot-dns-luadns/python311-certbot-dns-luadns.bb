SUMMARY = "LuaDNS Authenticator plugin for Certbot"
DESCRIPTION = "LuaDNS DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python311-certbot-dns-luadns-2.6.0-1.3.noarch.rpm"
RPM_HASH = "5749ce4b8863a38a3547c816075f194a27b7fa72feb8d2472d3b4ca10e9e977a71f64c6fd16337eac5f47c18eb51bd39ab072953afb4e5f1ce37b48ebecf18b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-luadns \
python3.11dist-certbot-dns-luadns \
python311-certbot-dns-luadns \
python3dist-certbot-dns-luadns"

RDEPENDS:${PN} += "python-abi \
python311-acme \
python311-certbot \
python311-dns-lexicon"

inherit rpm
