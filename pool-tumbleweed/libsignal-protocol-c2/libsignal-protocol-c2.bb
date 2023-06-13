SUMMARY = "Signal Protocol C Library"
DESCRIPTION = "The libsignal-protocol-c library is a forward secrecy protocol library written in C."
LICENSE = "GPL-3.0-only"

PV = "2.3.3"

RPM_NAME = "libsignal-protocol-c2-2.3.3-1.13.aarch64.rpm"
RPM_HASH = "dfba03d1b076c5067b2eeb2b22076ecbb544f2bd0802b29ba94cf2e78d5905cec2a48cb1adb9940f00fbbe9ca01b7c18d0bff78ee191ce6dbef0889696a58274"

RPROVIDES:${PN} += "libsignal-protocol-c.so.2()(64bit) \
libsignal-protocol-c2 \
libsignal-protocol-c2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
