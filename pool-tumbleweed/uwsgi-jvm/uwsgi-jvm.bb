SUMMARY = "JVM Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for embedding a Java virtual machine in uWSGI."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-jvm-2.0.21-3.1.aarch64.rpm"
RPM_HASH = "d270f19df2d54b914210a7abb05e79644a403b96ad2e3ca82f34fa5acf1cee47631593149ce4e6ce5de3e799731594ee19fcba31f85293773552556ea9f37f22"

RPROVIDES:${PN} += "uwsgi-jvm \
uwsgi-jwsgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
uwsgi"

inherit rpm
