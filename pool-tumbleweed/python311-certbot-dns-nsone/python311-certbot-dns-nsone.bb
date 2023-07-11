SUMMARY = "NS1 Authenticator plugin for Certbot"
DESCRIPTION = "Nsone DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python311-certbot-dns-nsone-2.6.0-1.3.noarch.rpm"
RPM_HASH = "22cc6476358fcfa5203f48a34d56e896e7c79cce98eb4249b88ba4899c63b50b7a90d4c3e8d7cf02dd609ddf5eab380c27be50098ab4f45d175119ca6bc4f99e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-nsone \
python3.11dist-certbot-dns-nsone \
python311-certbot-dns-nsone \
python3dist-certbot-dns-nsone"

RDEPENDS:${PN} += "python-abi \
python311-acme \
python311-certbot \
python311-dns-lexicon"

inherit rpm
