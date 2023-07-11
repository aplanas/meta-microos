SUMMARY = "NS1 Authenticator plugin for Certbot"
DESCRIPTION = "Nsone DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python310-certbot-dns-nsone-2.6.0-1.3.noarch.rpm"
RPM_HASH = "1a8a9f412d5f61200a46a7449aae51a7afed110132944dd793dd0a37dd664cccd337e8d8881d93930cef1b131d269ef2ee4b3e5d180214e3a4827e586b277a4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-certbot-dns-nsone \
python310-certbot-dns-nsone \
python3dist-certbot-dns-nsone"

RDEPENDS:${PN} += "python-abi \
python310-acme \
python310-certbot \
python310-dns-lexicon"

inherit rpm
