SUMMARY = "GlusterFS handler for tcmu-runner"
DESCRIPTION = "This package contains the GlusterFS handler for tcmu-runner, which \
allows for LIO/tcmu logical units to be backed by GlusterFS provisioned \
storage."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "tcmu-runner-handler-glusterfs-1.6.0-1.3.aarch64.rpm"
RPM_HASH = "a0470b3212179dc7d3e3166ac34f14e1b946ec16621296c6e5cce7f9d70508b198aeca1facc249118f96035b06be6d4a07746c2ce33cd3649639506d773cc7e5"

RPROVIDES:${PN} += "tcmu-runner-handler-glusterfs \
tcmu-runner-handler-glusterfs(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgfapi.so.0()(64bit) \
libgfapi.so.0(GFAPI_3.4.0)(64bit) \
libgfapi.so.0(GFAPI_4.0.0)(64bit) \
libgfapi.so.0(GFAPI_6.0)(64bit) \
libtcmalloc.so.4()(64bit) \
tcmu-runner"

inherit rpm
