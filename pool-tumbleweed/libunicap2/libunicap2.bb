SUMMARY = "Library to access different kinds of (video) capture devices"
DESCRIPTION = "Unicap provides a uniform interface to video capture devices. It allows \
applications to use any supported video capture device via a single API. \
The included ucil library provides easy to use functions to render text \
and graphic overlays onto video images."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.12"

RPM_NAME = "libunicap2-0.9.12-22.14.aarch64.rpm"
RPM_HASH = "4d5e383d388f892a5497a50f51236d3a136bab20db9cf9580f5d194fef87f7b128ad899f54f9442c65b9db18c27c3a5d6cff5033b508253c6874ad144adb2e47"

RPROVIDES:${PN} += "libeuvccam_cpi.so()(64bit) \
libunicap.so.2()(64bit) \
libunicap2 \
libunicap2(aarch-64) \
libv4l2cpi.so()(64bit) \
unicap"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libraw1394.so.11()(64bit)"

inherit rpm
