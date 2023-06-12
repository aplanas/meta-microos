SUMMARY = "Development files for usbguard"
DESCRIPTION = "The usbguard-devel package contains libraries and header files for \
developing applications that use usbguard."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.2"

RPM_NAME = "usbguard-devel-1.1.2-3.1.aarch64.rpm"
RPM_HASH = "0aa14ab068a20dd33f733784138b8c61cb7683356d5ec7195b47c2a1f3611f4c415386d546896e17ee95f2624b4fe2ea99bcfb15208d48ca1a80b7bfb8517381"

RPROVIDES:${PN} += "pkgconfig(libusbguard) \
usbguard-devel \
usbguard-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstdc++-devel \
libusbguard1 \
pkgconfig \
pkgconfig(libqb) \
usbguard"

inherit rpm
