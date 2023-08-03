SUMMARY = "Apache configuration for nextcloud"
DESCRIPTION = "This subpackage contains the Apache configuration files"
LICENSE = "AGPL-3.0-only"

PV = "26.0.4"

RPM_NAME = "nextcloud-apache-26.0.4-1.1.noarch.rpm"
RPM_HASH = "d2d7b8c9044004245ad09b3926f2dda2b31f06d27c54c1d682b7f74ca1f103c98918419675a065a75cfc7979d9547bbb13b20eb5e40fe4e2e7c00ced9e71c2ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-nextcloud-apache \
nextcloud-apache"

RDEPENDS:${PN} += "apache2 \
mod-php-any \
nextcloud"

inherit rpm
