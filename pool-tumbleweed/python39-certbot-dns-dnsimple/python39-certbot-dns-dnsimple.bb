SUMMARY = "DNSimple Authenticator plugin for Certbot"
DESCRIPTION = "DNSimple DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python39-certbot-dns-dnsimple-2.6.0-1.3.noarch.rpm"
RPM_HASH = "f966fe2b51f87599a8eb0f5f2dd284bc9fbc508d4038a13fd36ab3c997d216e2695020b21d64470d9e29c4aef7e085375011df57a312332ca6384b2e6aaf9e7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-certbot-dns-dnsimple \
python39-certbot-dns-dnsimple \
python3dist-certbot-dns-dnsimple"

RDEPENDS:${PN} += "python-abi \
python39-acme \
python39-certbot \
python39-dns-lexicon"

inherit rpm
