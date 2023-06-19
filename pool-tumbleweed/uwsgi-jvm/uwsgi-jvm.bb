SUMMARY = "JVM Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for embedding a Java virtual machine in uWSGI."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-jvm-2.0.21-2.1.aarch64.rpm"
RPM_HASH = "076fabee13f1a73bfa98077e04c0166a6015c89627549c1ad00e01620a4f2b76aad191e9eddeef39abba3ed5c1d3699f8b18c610c9b3995c6e6c2944ac350465"

RPROVIDES:${PN} += "uwsgi-jvm \
uwsgi-jwsgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
uwsgi"

inherit rpm
