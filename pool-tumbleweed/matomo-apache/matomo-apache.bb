SUMMARY = "Apache configuration for matomo"
DESCRIPTION = "This subpackage contains the Apache configuration files"
LICENSE = "GPL-3.0-or-later"

PV = "4.15.0"

RPM_NAME = "matomo-apache-4.15.0-1.1.noarch.rpm"
RPM_HASH = "02d15470e113c50292ccbf1235149173f725413ea3c051b96122ccda1773200bc3dd8c915fe7b69670e98eed8e4c5e1ba322921ba16610d5e38bed4e1c034ec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-matomo-apache \
matomo-apache"

RDEPENDS:${PN} += "apache2 \
mod-php-any"

inherit rpm
