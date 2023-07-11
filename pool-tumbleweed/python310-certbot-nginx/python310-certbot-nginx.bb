SUMMARY = "Nginx plugin for Certbot"
DESCRIPTION = "The Nginx plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python310-certbot-nginx-2.6.0-1.3.noarch.rpm"
RPM_HASH = "410f41cb05f103a6c043f0f71686cc78ec91fab37464f669a24374dfec7e93e681e5fb4a5e643d023a9ca968a1596d1199f3e8df2ecefbf4cf49ebab6a598fc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-certbot-nginx \
python310-certbot-nginx \
python3dist-certbot-nginx"

RDEPENDS:${PN} += "nginx \
python-abi \
python310-acme \
python310-certbot \
python310-pyOpenSSL \
python310-pyparsing"

inherit rpm
