SUMMARY = "Nginx configuration for Pagure"
DESCRIPTION = "This package provides the configuration files for deploying \
a Pagure server using the Nginx web server."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-web-nginx-5.13.3-1.4.noarch.rpm"
RPM_HASH = "07c91b5a3e9c0cdf048edcd72795d465cc37ce9e5131ac44f54de0599b9e0f7bb55affd04b19c34a62c8d2930fc700689fe4bb0e1abc7adea4e5102fd90293d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pagure-web-nginx \
pagure-web-nginx"

RDEPENDS:${PN} += "/bin/sh \
nginx \
pagure \
python3-gunicorn"

inherit rpm
