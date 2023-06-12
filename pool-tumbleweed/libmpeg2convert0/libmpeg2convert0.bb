SUMMARY = "MPEG-2 Video Stream Decoder"
DESCRIPTION = "libmpeg2 is a library for decoding MPEG-1 and MPEG-2 video streams."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "libmpeg2convert0-0.5.1-3.12.aarch64.rpm"
RPM_HASH = "a8a843177b37495ff12c051eea68537913cdcb39755c9a9f4fa4344979dc62fa193a2fee7ea872d60c3c0e3fa5f0a827f11bd4e3a64e6399aa771befdb6079bd"

RPROVIDES:${PN} += "libmpeg2convert.so.0()(64bit) \
libmpeg2convert0 \
libmpeg2convert0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
