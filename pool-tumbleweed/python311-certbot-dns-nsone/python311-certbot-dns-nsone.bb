SUMMARY = "NS1 Authenticator plugin for Certbot"
DESCRIPTION = "Nsone DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python311-certbot-dns-nsone-1.31.0-1.4.noarch.rpm"
RPM_HASH = "b82ae1f888cdcf4343ece9551496a581a13c02adb221e99d94fd9a2c17b7406d00cfe10f7aa8096ab18fcf6eae434c8e80e13b19af442b3b0226cc70f4e32ddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-certbot-dns-nsone \
python311-certbot-dns-nsone \
python3dist-certbot-dns-nsone"

RDEPENDS:${PN} += "python-abi \
python311-acme \
python311-certbot \
python311-dns-lexicon"

inherit rpm
