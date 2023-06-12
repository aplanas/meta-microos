SUMMARY = "Development files for wiiuse"
DESCRIPTION = "The wiiuse-devel package contains libraries and header files for \
developing applications that use wiiuse."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.15.5"

RPM_NAME = "libwiiuse0-0.15.5-2.2.aarch64.rpm"
RPM_HASH = "a24677c196de3b38413e3f097be81264acef33b556c7df6961432eac13576c95e5d9b47d725608410520b0166e3480d7aaecf3c7f18d6dc013d76cf9b7a095ca"

RPROVIDES:${PN} += "libwiiuse.so.0()(64bit) \
libwiiuse0 \
libwiiuse0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbluetooth.so.3()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
