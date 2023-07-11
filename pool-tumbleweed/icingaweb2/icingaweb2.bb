SUMMARY = "Icinga Web 2"
DESCRIPTION = "Icinga Web 2 is the monitoring web interface for icinga2. \
 \
It comes with a completely new design and many user-friendly enhancements to \
find the relevant information even faster."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.11.4"

RPM_NAME = "icingaweb2-2.11.4-3.1.noarch.rpm"
RPM_HASH = "18ba98824bd85cdf6f667d90a18b63b1130ce717381a435296870bcc3c1904f2415459cb38be0bba9c208a2b07acf4807c662692fe4f9c0d89663b07ff218a37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-icingaweb2 \
icingaweb2"

RDEPENDS:${PN} += "/usr/bin/sh \
apache2 \
icinga-l10n \
icinga-php-library \
icinga-php-thirdparty \
icingacli \
icingaweb2-common \
icingaweb2-vendor-HTMLPurifier \
icingaweb2-vendor-JShrink \
icingaweb2-vendor-Parsedown \
icingaweb2-vendor-dompdf \
icingaweb2-vendor-lessphp \
php \
php-Icinga \
php-ldap \
php-mysql \
php-pgsql \
pwdutils"

inherit rpm
