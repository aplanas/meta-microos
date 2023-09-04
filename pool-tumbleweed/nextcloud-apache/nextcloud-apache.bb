SUMMARY = "Apache configuration for nextcloud"
DESCRIPTION = "This subpackage contains the Apache configuration files"
LICENSE = "AGPL-3.0-only"

PV = "26.0.5"

RPM_NAME = "nextcloud-apache-26.0.5-1.1.noarch.rpm"
RPM_HASH = "eafbd9c5b9955072ebac22f899ca33f15ac946411ea9315897cd48c61a234f051dba2e469a66a9de71a1eccd851565ba8c9b6f0f8a8c1ca77c054f6d99e2605c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-nextcloud-apache \
nextcloud-apache"

RDEPENDS:${PN} += "apache2 \
mod-php-any \
nextcloud"

inherit rpm
