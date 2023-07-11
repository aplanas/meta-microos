SUMMARY = "PHP FPM configuration for icingaweb2"
DESCRIPTION = "This package contains the PHP FPM configuration file to run icingaweb2 with php-fpm."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.11.4"

RPM_NAME = "icingaweb2-php-fpm-2.11.4-3.1.noarch.rpm"
RPM_HASH = "8283dcb003b6a139a6b750fa3fd75753e1f7df1b4784456bd8ef8fae8abe65df3f2725eb26f8d716e851d8d8e0012621ac2d1bc660edd2078230ca677934a10a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-icingaweb2-php-fpm \
icingaweb2-php-fpm"

RDEPENDS:${PN} += "icingaweb2"

inherit rpm
