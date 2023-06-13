SUMMARY = "Reiser4 filesystem library"
DESCRIPTION = "Reiser4 support library implementing the main filesystem logic for \
the reiser4progs utilities."
LICENSE = "GPL-2.0-only"

PV = "2.0.5"

RPM_NAME = "libreiser4-2_0-5-2.0.5-1.7.aarch64.rpm"
RPM_HASH = "4d31836c419fe6c146f8b5e1b411b1b06e08e27fb76f95614df3af1eb2eeed9b0775ed6c95ff6a02aac501e029d73a0ee687696ee79c96c7a89be88a5f6847f4"

RPROVIDES:${PN} += "libreiser4-2.0.so.5()(64bit) \
libreiser4-2_0-5 \
libreiser4-2_0-5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libaal-1.0.so.7()(64bit) \
libc.so.6()(64bit) \
libreadline.so.8()(64bit) \
libuuid.so.1()(64bit)"

inherit rpm
