SUMMARY = "PHP8 Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
 \
This package contains support for PHP version 8."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-php8-2.0.21-3.2.aarch64.rpm"
RPM_HASH = "2484badd6d17d7b1a37915b13b18b9b7942f3294dea691689a89979d7860b309717aed186084f7558d21122bdc51f5c48f863605e0191f45ab84a4ea2f8ae226"

RPROVIDES:${PN} += "uwsgi-php8"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libphp.so \
php8-embed \
uwsgi"

inherit rpm
