SUMMARY = "The multipath plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to multipath devices."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_mpath2-2.28-1.4.aarch64.rpm"
RPM_HASH = "be8575c093b7c347a8f6045d5ed32988de534aad80c0db67a639d3d160b57ee034b55410914e6a3ea9db8e631a8fb7504a6cc3602c16ddf36fed59f7a316db50"

RPROVIDES:${PN} += "libbd-mpath.so.2 \
libbd-mpath2 \
libblockdev-mpath"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbd-utils.so.2 \
libbd-utils2 \
libc.so.6 \
libdevmapper.so.1.03 \
libglib-2.0.so.0 \
multipath-tools"

inherit rpm
