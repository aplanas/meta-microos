SUMMARY = "uWSGI Module for Apache 2.0"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains an Apache 2.0 module for uWSGI."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "apache2-mod_uwsgi-2.0.21-3.1.aarch64.rpm"
RPM_HASH = "40199e0e74081dc766bec49fe98092f0c32ace71401b1d01ddddffcb07fa940a802a5f7256b7a63ead5bde481a464898b0baf06ae0822ff94a6ebb82f296e2f2"

RPROVIDES:${PN} += "apache2-mod-uwsgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
uwsgi"

inherit rpm
