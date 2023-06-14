SUMMARY = "GlusterFS handler for tcmu-runner"
DESCRIPTION = "This package contains the GlusterFS handler for tcmu-runner, which \
allows for LIO/tcmu logical units to be backed by GlusterFS provisioned \
storage."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "tcmu-runner-handler-glusterfs-1.6.0-1.3.aarch64.rpm"
RPM_HASH = "a0470b3212179dc7d3e3166ac34f14e1b946ec16621296c6e5cce7f9d70508b198aeca1facc249118f96035b06be6d4a07746c2ce33cd3649639506d773cc7e5"

RPROVIDES:${PN} += "tcmu-runner-handler-glusterfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgfapi.so.0 \
libtcmalloc.so.4 \
tcmu-runner"

inherit rpm
