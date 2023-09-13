SUMMARY = "PHP readline extension"
DESCRIPTION = "PHP interface to libedit, which provides editable command line as well \
as PHP interactive mode (php -a)."
LICENSE = "MIT & PHP-3.01"

PV = "8.2.10"

RPM_NAME = "php8-readline-8.2.10-2.1.aarch64.rpm"
RPM_HASH = "7fee3bcc29ca483f15e68c27491fd7582f2be12abaea4be954e303c96c14f7d79ee833c5cf9a49220a8d59e232834156d9727273bb2e7e650d1186865002c633"

RPROVIDES:${PN} += "config-php8-readline \
php-readline \
php8-readline"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0 \
php"

inherit rpm
