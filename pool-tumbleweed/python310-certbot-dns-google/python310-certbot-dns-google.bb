SUMMARY = "Google Cloud Authenticator plugin for Certbot"
DESCRIPTION = "Google Cloud DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python310-certbot-dns-google-1.31.0-1.4.noarch.rpm"
RPM_HASH = "db5555a9ace65151c16f9aad28ddc03fb78b4ceb22c47548816ebdedd0b65484d35ffb9bb72d5edb73d75d4b0cd34488e00603429aac005ee23f1535f21f1722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certbot-dns-google \
python3.10dist(certbot-dns-google) \
python310-certbot-dns-google \
python3dist(certbot-dns-google)"

RDEPENDS:${PN} += "python(abi) \
python310-acme \
python310-certbot \
python310-google-api-python-client \
python310-google-auth \
python310-zope.interface"

inherit rpm
