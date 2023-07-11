SUMMARY = "The multipath plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to multipath devices."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_mpath2-2.28-1.6.aarch64.rpm"
RPM_HASH = "672d4f34ee09ccbda7d677c344ae8d4956e67de06ad27f8a9b33a03f9216700264300868c0bf0417926acc9a3fee494c42cecf17b186e60667d9251be2c4a617"

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
