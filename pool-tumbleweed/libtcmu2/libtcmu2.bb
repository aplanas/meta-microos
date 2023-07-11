SUMMARY = "Runtime libraries for tcmu-runner"
DESCRIPTION = "This package contains the runtime libraries for tcmu-runner."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "libtcmu2-1.6.0-1.4.aarch64.rpm"
RPM_HASH = "08e93a127c5edb91931f9c2658b33b6538f0a7e72da84811d4e4328d253473b9f1a3c2989d9434f5f367680ea73f7c5681c465e3e11dc0f12565c8c72f4b659f"

RPROVIDES:${PN} += "libtcmu.so.2 \
libtcmu2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libtcmalloc.so.4"

inherit rpm
