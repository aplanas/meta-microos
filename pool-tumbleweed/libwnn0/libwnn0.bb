SUMMARY = "FreeWnn Input System library"
DESCRIPTION = "This subpackage contains a core library of the Wnn input system."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "libwnn0-1.1.1a023.1-4.3.aarch64.rpm"
RPM_HASH = "256dee901c0f1fc886c0916cba180ec84de5c0477ab58ca8d2a5b9526395a4d8c037321da2e8dc0fcf9f50e30c9dc36a0a21e9670b9bb66a120b49c391f8bc7b"

RPROVIDES:${PN} += "libwnn.so.0()(64bit) \
libwnn0 \
libwnn0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit)"

inherit rpm
