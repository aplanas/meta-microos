SUMMARY = "Nginx plugin for Certbot"
DESCRIPTION = "The Nginx plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python39-certbot-nginx-2.6.0-1.3.noarch.rpm"
RPM_HASH = "464885b983f27698b3f1e8b051beceab6b2275fab2c9138133fcd81e6547d865ea60a8deb116edfc539cead657b98a90bcb8ec0c40a917615cf3c6958a4d394e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-certbot-nginx \
python39-certbot-nginx \
python3dist-certbot-nginx"

RDEPENDS:${PN} += "nginx \
python-abi \
python39-acme \
python39-certbot \
python39-pyOpenSSL \
python39-pyparsing"

inherit rpm
