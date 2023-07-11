SUMMARY = "GlusterFS handler for tcmu-runner"
DESCRIPTION = "This package contains the GlusterFS handler for tcmu-runner, which \
allows for LIO/tcmu logical units to be backed by GlusterFS provisioned \
storage."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "tcmu-runner-handler-glusterfs-1.6.0-1.4.aarch64.rpm"
RPM_HASH = "f5cef872b52ef158a60eb0a21cc61b085e32998336f65430a1f796fda9198022bea643f1c7caa371db877c2015c96073a225cc9405395891b2a8a21c4db5b9e6"

RPROVIDES:${PN} += "tcmu-runner-handler-glusterfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgfapi.so.0 \
libtcmalloc.so.4 \
tcmu-runner"

inherit rpm
