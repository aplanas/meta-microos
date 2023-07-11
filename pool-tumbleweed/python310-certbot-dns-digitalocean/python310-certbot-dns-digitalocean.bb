SUMMARY = "DigitalOcean Authenticator plugin for Certbot"
DESCRIPTION = "Digitalocean DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python310-certbot-dns-digitalocean-2.6.0-1.3.noarch.rpm"
RPM_HASH = "57e7a765660d1075a348efac82dec727ad1e72060c921a022b5860cf1f6795b1a70214b9ab2765387efceb9da3c08b1fc4a42276685465ef0db3e64295b58881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-certbot-dns-digitalocean \
python310-certbot-dns-digitalocean \
python3dist-certbot-dns-digitalocean"

RDEPENDS:${PN} += "python-abi \
python310-acme \
python310-certbot \
python310-digitalocean"

inherit rpm
