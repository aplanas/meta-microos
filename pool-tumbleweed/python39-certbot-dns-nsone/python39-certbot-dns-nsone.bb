SUMMARY = "NS1 Authenticator plugin for Certbot"
DESCRIPTION = "Nsone DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python39-certbot-dns-nsone-2.6.0-1.3.noarch.rpm"
RPM_HASH = "a8d4c2b862bec97c506aa413fba449f1c95c60ba0fb31d949315c9168e6847233cd7eb5f1f6543ac84b58a5cd28d1d99ac3f843be343ed1481cce79227b62a8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-certbot-dns-nsone \
python39-certbot-dns-nsone \
python3dist-certbot-dns-nsone"

RDEPENDS:${PN} += "python-abi \
python39-acme \
python39-certbot \
python39-dns-lexicon"

inherit rpm
