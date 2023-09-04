SUMMARY = "JVM Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for embedding a Java virtual machine in uWSGI."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-jvm-2.0.21-3.2.aarch64.rpm"
RPM_HASH = "7600e7547b46de53150d7739df2613a9b8a5a2fabce92e725d5eed00bada8769d9577725550c59a1e6bd167404c1c855df5a41e3d82f07c1a15af6790d7b2ea9"

RPROVIDES:${PN} += "uwsgi-jvm \
uwsgi-jwsgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
uwsgi"

inherit rpm
