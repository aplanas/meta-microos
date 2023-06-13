SUMMARY = "JBIG2 Decoder Library"
DESCRIPTION = "jbig2dec is a decoder utility implementing the JBIG2 bi-level image compression \
spec. Also known as ITU T.88 and ISO IEC 14492, and included by reference in \
Adobe's PDF version 1.4 and later."
LICENSE = "AGPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "libjbig2dec0-0.19-1.11.aarch64.rpm"
RPM_HASH = "1fa82b728206e10064759cbf3440ba8dc68afb8cf62de1996d44a231d816987b771ee351ac3de1ab939413b316d4a15a6edee1dc8c0f5e6f4b30f97c1f8d45ba"

RPROVIDES:${PN} += "libjbig2dec.so.0()(64bit) \
libjbig2dec0 \
libjbig2dec0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
