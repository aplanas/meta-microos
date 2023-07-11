SUMMARY = "DNSimple Authenticator plugin for Certbot"
DESCRIPTION = "DNSimple DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python310-certbot-dns-dnsimple-2.6.0-1.3.noarch.rpm"
RPM_HASH = "b3b4f487db64e222d0fe1b8725d8ae90201fc675ef4d2726420a2e8095778dfd6c2819544e1cfa09924c098582102a563be0f1a162471a321b675be93697ee9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-certbot-dns-dnsimple \
python310-certbot-dns-dnsimple \
python3dist-certbot-dns-dnsimple"

RDEPENDS:${PN} += "python-abi \
python310-acme \
python310-certbot \
python310-dns-lexicon"

inherit rpm
