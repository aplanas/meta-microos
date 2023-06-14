SUMMARY = "PHP8 Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
 \
This package contains support for PHP version 8."
LICENSE = "Apache-2.0 & GPL-2.0-only-WITH-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-php8-2.0.21-2.1.aarch64.rpm"
RPM_HASH = "63fd4f19792651c4157108192255ea7d3ec486e84f5cb4040fd7d54d86f1afa533d9a50130f611503fcba66bd9688d79faf986be269837122c019244dace991a"

RPROVIDES:${PN} += "uwsgi-php8"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libphp.so \
php8-embed \
uwsgi"

inherit rpm
