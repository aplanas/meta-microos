SUMMARY = "DigitalOcean Authenticator plugin for Certbot"
DESCRIPTION = "Digitalocean DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python39-certbot-dns-digitalocean-2.6.0-1.3.noarch.rpm"
RPM_HASH = "199366f6ded0cc2b65adef23bf0bb8f1957216aa24af7b4db21be77d198a77871891185f328080985ec247c413112bae9014c60bbc0eb14f24e2cf156c3c6657"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-certbot-dns-digitalocean \
python39-certbot-dns-digitalocean \
python3dist-certbot-dns-digitalocean"

RDEPENDS:${PN} += "python-abi \
python39-acme \
python39-certbot \
python39-digitalocean"

inherit rpm
