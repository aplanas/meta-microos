SUMMARY = "Google Cloud Authenticator plugin for Certbot"
DESCRIPTION = "Google Cloud DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python39-certbot-dns-google-2.6.0-1.3.noarch.rpm"
RPM_HASH = "8ee2caa08543522b3a3a1229d2fe587a1130f15f8d135ba8bd96d1478714ac3723016146783a78da7f522e6d624f5efa2ba05ca4d8b4ea36fb83a43f72839a72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-certbot-dns-google \
python39-certbot-dns-google \
python3dist-certbot-dns-google"

RDEPENDS:${PN} += "python-abi \
python39-acme \
python39-certbot \
python39-google-api-python-client \
python39-google-auth"

inherit rpm
