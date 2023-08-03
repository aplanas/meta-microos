SUMMARY = "GlusterFS handler for tcmu-runner"
DESCRIPTION = "This package contains the GlusterFS handler for tcmu-runner, which \
allows for LIO/tcmu logical units to be backed by GlusterFS provisioned \
storage."
LICENSE = "Apache-2.0"

PV = "1.6.2"

RPM_NAME = "tcmu-runner-handler-glusterfs-1.6.2-1.1.aarch64.rpm"
RPM_HASH = "b6a05a9295d7cfc6a2467f7c835c1c082f16ab9b174e8a1541f958c9ebaefac991e19c34172116075e84eba5eed3e56840dcd2f848dd41953e1d5143c9c11110"

RPROVIDES:${PN} += "tcmu-runner-handler-glusterfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgfapi.so.0 \
libtcmalloc.so.4 \
tcmu-runner"

inherit rpm
