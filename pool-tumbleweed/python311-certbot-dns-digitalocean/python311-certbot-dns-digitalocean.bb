SUMMARY = "DigitalOcean Authenticator plugin for Certbot"
DESCRIPTION = "Digitalocean DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python311-certbot-dns-digitalocean-2.6.0-1.3.noarch.rpm"
RPM_HASH = "a6d10adc3670e38c37b7a62ad9898542ce3578beba3ab54acfd211c73c469ee242f5d566d90ff1d4b0379a5b2159929e05c9986df33e5333538073f622d5942d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-digitalocean \
python3.11dist-certbot-dns-digitalocean \
python311-certbot-dns-digitalocean \
python3dist-certbot-dns-digitalocean"

RDEPENDS:${PN} += "python-abi \
python311-acme \
python311-certbot \
python311-digitalocean"

inherit rpm
