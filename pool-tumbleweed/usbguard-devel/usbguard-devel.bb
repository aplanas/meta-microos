SUMMARY = "Development files for usbguard"
DESCRIPTION = "The usbguard-devel package contains libraries and header files for \
developing applications that use usbguard."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.2"

RPM_NAME = "usbguard-devel-1.1.2-3.2.aarch64.rpm"
RPM_HASH = "0f18a2dd4cbae3287e24abb421f9bd956585a22619e79fdfdf7063cab2617c55fb5dafeebca1fb209da25e9ced9ef3855adf649d0160496de243b038cfd0347d"

RPROVIDES:${PN} += "pkgconfig-libusbguard \
usbguard-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstdc++-devel \
libusbguard1 \
pkgconfig \
pkgconfig-libqb \
usbguard"

inherit rpm
