SUMMARY = "Nginx configuration for Pagure"
DESCRIPTION = "This package provides the configuration files for deploying \
a Pagure server using the Nginx web server."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-web-nginx-5.13.3-1.5.noarch.rpm"
RPM_HASH = "f811781be84558074c33ae3404446f9e5ad2d2a3c54c04bdd48104ca546d23b0eb76f008d9a5ee2f6416f80614e97f98f5d9cbb3f5119e1be237490cb7cf0da2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pagure-web-nginx \
pagure-web-nginx"

RDEPENDS:${PN} += "/usr/bin/sh \
nginx \
pagure \
python3-gunicorn"

inherit rpm
