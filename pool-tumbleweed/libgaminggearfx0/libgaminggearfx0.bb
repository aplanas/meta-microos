SUMMARY = "Gaming input devices library - libgaminggearfx"
DESCRIPTION = "A shared library initiated by the Roccat Linux driver project. \
 \
This package holds libgaminggearfx."
LICENSE = "GPL-2.0-only & CC-BY-3.0"

PV = "0.15.1"

RPM_NAME = "libgaminggearfx0-0.15.1-3.15.aarch64.rpm"
RPM_HASH = "11f2451a51543d31af6a4ffd2c716d0b8ca065f1aacfbb9c0a421776419d3e2af8ef8d4cefe760260fdf7f4b44a8fbd2681cae41e65a57b446971b001defd9f4"

RPROVIDES:${PN} += "libgaminggearfx.so.0()(64bit) \
libgaminggearfx0 \
libgaminggearfx0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit)"

inherit rpm
