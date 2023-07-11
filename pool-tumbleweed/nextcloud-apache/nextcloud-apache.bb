SUMMARY = "Apache configuration for nextcloud"
DESCRIPTION = "This subpackage contains the Apache configuration files"
LICENSE = "AGPL-3.0-only"

PV = "26.0.3"

RPM_NAME = "nextcloud-apache-26.0.3-1.1.noarch.rpm"
RPM_HASH = "6fcb2e5eb9262a8cb721ff912f71128fa564575dd252d1ad794c027789ab67e41e7e1813d67872276649d36ee85c4eb85b84dd837815026b59ee15f83a79cdd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-nextcloud-apache \
nextcloud-apache"

RDEPENDS:${PN} += "apache2 \
mod-php-any \
nextcloud"

inherit rpm
