SUMMARY = "Google Cloud Authenticator plugin for Certbot"
DESCRIPTION = "Google Cloud DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python39-certbot-dns-google-1.31.0-1.4.noarch.rpm"
RPM_HASH = "c8b49c446310b4077e2f07134d9dffcaf21c17bc81fbdaeafde8438d2291331154635d762043382c53e1bb57871edf2215e740fcbca9584b7213d5089ac491fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-certbot-dns-google \
python39-certbot-dns-google \
python3dist-certbot-dns-google"

RDEPENDS:${PN} += "python-abi \
python39-acme \
python39-certbot \
python39-google-api-python-client \
python39-google-auth \
python39-zope.interface"

inherit rpm
