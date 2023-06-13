SUMMARY = "GlusterFS Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for returning objects directly from a GlusterFS \
filesystem"
LICENSE = "Apache-2.0 & GPL-2.0-only-WITH-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-glusterfs-2.0.21-2.1.aarch64.rpm"
RPM_HASH = "9c8624c11b6caafc2a609c90cd8c6f645c3424dd02ee63b69def856d6261ba599ba6d67f5938f0d483b7314d3348ab1a1473bf6fdc1a8005f4f678338703fcd9"

RPROVIDES:${PN} += "uwsgi-glusterfs \
uwsgi-glusterfs(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgfapi.so.0()(64bit) \
libgfapi.so.0(GFAPI_3.4.0)(64bit) \
libgfapi.so.0(GFAPI_6.0)(64bit) \
uwsgi"

inherit rpm
