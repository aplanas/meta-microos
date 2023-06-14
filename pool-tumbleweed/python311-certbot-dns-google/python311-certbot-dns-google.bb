SUMMARY = "Google Cloud Authenticator plugin for Certbot"
DESCRIPTION = "Google Cloud DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python311-certbot-dns-google-1.31.0-1.4.noarch.rpm"
RPM_HASH = "1732952ed8c4f1423134937cae3e606c7541bc10c3b0b723c5ec13eb9de88b14a896e8109f6023d26176a48e54f8f3d4b82c6f8ddedc6e4cf044fcf974dd03e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-certbot-dns-google \
python311-certbot-dns-google \
python3dist-certbot-dns-google"

RDEPENDS:${PN} += "python-abi \
python311-acme \
python311-certbot \
python311-google-api-python-client \
python311-google-auth \
python311-zope.interface"

inherit rpm
