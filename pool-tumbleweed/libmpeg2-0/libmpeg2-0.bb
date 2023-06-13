SUMMARY = "MPEG-2 Video Stream Decoder"
DESCRIPTION = "libmpeg2 is a library for decoding MPEG-1 and MPEG-2 video streams."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "libmpeg2-0-0.5.1-3.12.aarch64.rpm"
RPM_HASH = "b6fe5e312000ce75124f7d72d2eb8984a0af4c9ef68ac9c3e9d4ef76d12591ccc73e4bd342e8be0766e871b588a03d57aeab898f354bfa4a41bc1699f23887e5"

RPROVIDES:${PN} += "libmpeg2-0 \
libmpeg2-0(aarch-64) \
libmpeg2.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
