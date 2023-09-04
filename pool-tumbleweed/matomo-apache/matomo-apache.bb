SUMMARY = "Apache configuration for matomo"
DESCRIPTION = "This subpackage contains the Apache configuration files"
LICENSE = "GPL-3.0-or-later"

PV = "4.15.1"

RPM_NAME = "matomo-apache-4.15.1-1.1.noarch.rpm"
RPM_HASH = "cf3eadcb30a17521139dcef3a53c8dc2581c763f97e830736be73a5a562539c55bb99ed8d18679c3aa4198b2f8453550f8a61cea61841db0029d04abb8e09773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-matomo-apache \
matomo-apache"

RDEPENDS:${PN} += "apache2 \
mod-php-any"

inherit rpm
