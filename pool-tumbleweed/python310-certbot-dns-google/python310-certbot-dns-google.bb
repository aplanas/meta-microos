SUMMARY = "Google Cloud Authenticator plugin for Certbot"
DESCRIPTION = "Google Cloud DNS Authenticator plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python310-certbot-dns-google-2.6.0-1.3.noarch.rpm"
RPM_HASH = "d169b5e3bedf887597b762277ee17d7c59adbd95d393c2f53ea2f79147ebfd447f038ea0967f27d081b7a3f0f86d8d8478ed0d801d8d1c0647fbc2d862b48b08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-certbot-dns-google \
python310-certbot-dns-google \
python3dist-certbot-dns-google"

RDEPENDS:${PN} += "python-abi \
python310-acme \
python310-certbot \
python310-google-api-python-client \
python310-google-auth"

inherit rpm
