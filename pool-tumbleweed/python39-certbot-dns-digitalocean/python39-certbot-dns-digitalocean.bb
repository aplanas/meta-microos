SUMMARY = "DigitalOcean Authenticator plugin for Certbot"
DESCRIPTION = "Digitalocean DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python39-certbot-dns-digitalocean-1.31.0-1.4.noarch.rpm"
RPM_HASH = "c40f5a0788c526a8dc6a996f4e4a3125f0a59d005e420b29daf324632c0518ef3e1f1ebd7b2b8f2f072b6b188937d6e01540b4190360fb4ea70dbbe74a6fc104"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-certbot-dns-digitalocean \
python39-certbot-dns-digitalocean \
python3dist-certbot-dns-digitalocean"

RDEPENDS:${PN} += "python-abi \
python39-acme \
python39-certbot \
python39-digitalocean \
python39-six \
python39-zope.interface"

inherit rpm
