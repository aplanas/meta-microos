SUMMARY = "Util library of fcitx"
DESCRIPTION = "Util library of fcitx"
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "libfcitx-utils0-4.2.9.9-2.1.aarch64.rpm"
RPM_HASH = "598417222a20d71177f454a43d5c61a7b0014698ee5136ee3eb1f8fbcae84b14829ab584b6574fb16f06ee68be4367b0873e3de06914b11af3ba5af0f290ea39"

RPROVIDES:${PN} += "libfcitx-utils.so.0 \
libfcitx-utils0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
