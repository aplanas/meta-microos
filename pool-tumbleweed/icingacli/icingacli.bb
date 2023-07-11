SUMMARY = "Icinga CLI"
DESCRIPTION = "Icinga CLI."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.11.4"

RPM_NAME = "icingacli-2.11.4-3.1.noarch.rpm"
RPM_HASH = "bd964406d34c12cb2f1740bf2036ccf74969fb0e48942e24ac225f5147eee0e48f3906b04522215e223cd9baaf6c3f725d3b09a266a34f1ff1bf6dd0e3f8b18a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingacli \
icingaweb2-icingacli"

RDEPENDS:${PN} += "/usr/bin/php \
bash-completion \
icinga-l10n \
icinga-php-library \
icinga-php-thirdparty \
icingaweb2-common \
php \
php-Icinga"

inherit rpm
