SUMMARY = "GlusterFS Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for returning objects directly from a GlusterFS \
filesystem"
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-glusterfs-2.0.21-3.1.aarch64.rpm"
RPM_HASH = "47f424af2d6cb6fe15da93a431ef3b6ada2536fb336879c489844207733eea0b972f1029d4d2b58b34529beed30ea12ea576f6553a0ea925f31e0e60f64c5e09"

RPROVIDES:${PN} += "uwsgi-glusterfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgfapi.so.0 \
uwsgi"

inherit rpm
