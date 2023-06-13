SUMMARY = "Reliable Internet Stream Transport protocol"
DESCRIPTION = "A library that can be used to speak the RIST protocol (as defined by Video \
Services Forum (VSF) Technical Recommendations TR-06-1 and TR-06-2)."
LICENSE = "BSD-2-Clause"

PV = "0.2.7"

RPM_NAME = "librist4-0.2.7-2.3.aarch64.rpm"
RPM_HASH = "1516e78f639eeee6e0d91d96f1d84c7721e41f259447f5c8406c71d2e5375cbf7869bb8d9e0d9f2bee032c43343514d7c7afe3e9704093503484e2a434c6260b"

RPROVIDES:${PN} += "librist.so.4()(64bit) \
librist4 \
librist4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
