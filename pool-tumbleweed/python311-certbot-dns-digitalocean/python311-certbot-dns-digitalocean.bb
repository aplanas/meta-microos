SUMMARY = "DigitalOcean Authenticator plugin for Certbot"
DESCRIPTION = "Digitalocean DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python311-certbot-dns-digitalocean-1.31.0-1.4.noarch.rpm"
RPM_HASH = "b1f32025a1327004c50bfa2256946e1340961e50de987dd4eba67a88a40f0e652e818ca7cda9e0c4f51a2209201f835b1dbbcbb5e3a7ddc4c80961a55b2aba3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(certbot-dns-digitalocean) \
python311-certbot-dns-digitalocean \
python3dist(certbot-dns-digitalocean)"

RDEPENDS:${PN} += "python(abi) \
python311-acme \
python311-certbot \
python311-digitalocean \
python311-six \
python311-zope.interface"

inherit rpm
