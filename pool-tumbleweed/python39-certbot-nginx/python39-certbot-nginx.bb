SUMMARY = "Nginx plugin for Certbot"
DESCRIPTION = "The Nginx plugin for Certbot."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python39-certbot-nginx-1.31.0-1.3.noarch.rpm"
RPM_HASH = "1068d09d7fdf238a60fb5c24bdabbca3215b7fb88c4380c471ad507f8e00703cfc65e5a45f668bcd301c9389262847d15717960999f96f9bbddb65e1d0235a80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(certbot-nginx) \
python39-certbot-nginx \
python3dist(certbot-nginx)"

RDEPENDS:${PN} += "nginx \
python(abi) \
python39-acme \
python39-certbot \
python39-pyOpenSSL \
python39-pyparsing"

inherit rpm
