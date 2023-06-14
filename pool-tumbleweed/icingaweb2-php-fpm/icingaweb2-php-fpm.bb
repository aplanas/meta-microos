SUMMARY = "PHP FPM configuration for icingaweb2"
DESCRIPTION = "This package contains the PHP FPM configuration file to run icingaweb2 with php-fpm."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.11.4"

RPM_NAME = "icingaweb2-php-fpm-2.11.4-2.1.noarch.rpm"
RPM_HASH = "2812dd844f8b6093ac6c3dd25c1ddb21b019003c410866abd7cacee1a54eef7ba5366148480e199a80362cfbf2a79ae498cafc084eb9e439b1573e6b15a45d9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-icingaweb2-php-fpm \
icingaweb2-php-fpm"

RDEPENDS:${PN} += "icingaweb2"

inherit rpm
