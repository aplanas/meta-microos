SUMMARY = "A set of tools for the opus audio codec"
DESCRIPTION = "The Opus codec is designed for interactive speech and audio transmission over \
the Internet. It is designed by the IETF Codec Working Group and incorporates \
technology from Skype's SILK codec and Xiph.Org's CELT codec. \
 \
This is a set of tools for the opus codec."
LICENSE = "BSD-2-Clause & GPL-2.0-only"

PV = "0.2"

RPM_NAME = "opus-tools-0.2-1.21.aarch64.rpm"
RPM_HASH = "1a3bee31812f940eb2b2f713ef165ca81ca248607f8c31ecf9c8a3398a0ec3eb3632eb864a842c57bb82911fc2a46192e5fac4aab0f26cd8a1cd390096bd121f"

RPROVIDES:${PN} += "opus-tools \
opus-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFLAC.so.12()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libogg.so.0()(64bit) \
libopus.so.0()(64bit) \
libopusenc.so.0()(64bit) \
libopusfile.so.0()(64bit) \
libopusurl.so.0()(64bit)"

inherit rpm
