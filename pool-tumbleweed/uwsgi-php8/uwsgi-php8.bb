SUMMARY = "PHP8 Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
 \
This package contains support for PHP version 8."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-php8-2.0.21-3.1.aarch64.rpm"
RPM_HASH = "038196c6802dbaee9b7ee41196443a778c60731643daac8323cf866bc8bac23ad3f6826cf034da33dc1b481f674f7fa197fd46e6b9c7fc74ade09ea587de3e70"

RPROVIDES:${PN} += "uwsgi-php8"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libphp.so \
php8-embed \
uwsgi"

inherit rpm
