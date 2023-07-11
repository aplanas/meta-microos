SUMMARY = "Apache HTTPD configuration for Pagure"
DESCRIPTION = "This package provides the configuration files for deploying \
a Pagure server using the Apache HTTPD server."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-web-apache-httpd-5.13.3-1.5.noarch.rpm"
RPM_HASH = "0aa2dde06b58188dcc48b730bccd37ce4bf0bc7223a88967c36b395e0d83f3375a5874a91562199dda0d331c00a85fd8c00f24610616a4e68219417e171e6e26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pagure-web-apache-httpd \
pagure-web-apache-httpd"

RDEPENDS:${PN} += "apache2-mod-wsgi-python3 \
pagure"

inherit rpm
