SUMMARY = "Ultra-Low Delay Audio Codec"
DESCRIPTION = "The CELT codec is an experimental audio codec for use in low-delay \
speech and audio communication."
LICENSE = "BSD-2-Clause"

PV = "0.11.3"

RPM_NAME = "celt-0.11.3-1.28.aarch64.rpm"
RPM_HASH = "69dc44913c6f850ccdfb770d667260e5fef0bb52d5f430debf7044a1a178e35ceed342fec843d837ba02b283398e4478d7ca71c8c73c65db5377dd0ef0aa0d10"

RPROVIDES:${PN} += "celt \
celt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcelt0-2 \
libcelt0.so.2()(64bit) \
libogg.so.0()(64bit)"

inherit rpm