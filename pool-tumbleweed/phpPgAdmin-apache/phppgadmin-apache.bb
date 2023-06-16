SUMMARY = "Apache configuration for phpPgAdmin"
DESCRIPTION = "This subpackage contains the Apache configuration files"
LICENSE = "GPL-2.0-or-later"

PV = "7.13.0"

RPM_NAME = "phpPgAdmin-apache-7.13.0-3.1.noarch.rpm"
RPM_HASH = "99d8c12625c5df8ce9d0fd9b25aafb929c5290f4670de78c91814850d105d0e317ee2365b609813d836fb31a329b88779823859769473811b39e2408e737da96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-phpPgAdmin-apache \
phpPgAdmin-apache"

RDEPENDS:${PN} += "/usr/bin/sh \
apache2 \
mod-php-any \
phpPgAdmin"

inherit rpm
