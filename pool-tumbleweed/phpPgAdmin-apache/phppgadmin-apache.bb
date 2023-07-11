SUMMARY = "Apache configuration for phpPgAdmin"
DESCRIPTION = "This subpackage contains the Apache configuration files"
LICENSE = "GPL-2.0-or-later"

PV = "7.13.0"

RPM_NAME = "phpPgAdmin-apache-7.13.0-3.2.noarch.rpm"
RPM_HASH = "a14c0e9ec8bd9d9b4101ab3975ffef4e57a76a5d7dda2ad5ee9f4c236c8ac7cc15cc6b8b03bb7000fd194c4bf73864ff22d8b41e37dfe7fda2f4afce3ccc4a1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-phpPgAdmin-apache \
phpPgAdmin-apache"

RDEPENDS:${PN} += "/usr/bin/sh \
apache2 \
mod-php-any \
phpPgAdmin"

inherit rpm
