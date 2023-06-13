SUMMARY = "Icinga Web 2"
DESCRIPTION = "Icinga Web 2 is the monitoring web interface for icinga2. \
 \
It comes with a completely new design and many user-friendly enhancements to \
find the relevant information even faster."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.11.4"

RPM_NAME = "icingaweb2-2.11.4-2.1.noarch.rpm"
RPM_HASH = "013ea902f5eb7543f1e74439633191c935796f72b93616d1a954dc205eb60229ae207e76624c23565e494ce71395e2a90bca18c1a42d73fcd2faa7691c73466f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(icingaweb2) \
icingaweb2"

RDEPENDS:${PN} += "(mod_php_any >= 7.3.0 or php-fpm) \
/bin/sh \
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
