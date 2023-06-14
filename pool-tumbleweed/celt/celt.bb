SUMMARY = "Ultra-Low Delay Audio Codec"
DESCRIPTION = "The CELT codec is an experimental audio codec for use in low-delay \
speech and audio communication."
LICENSE = "BSD-2-Clause"

PV = "0.11.3"

RPM_NAME = "celt-0.11.3-1.28.aarch64.rpm"
RPM_HASH = "69dc44913c6f850ccdfb770d667260e5fef0bb52d5f430debf7044a1a178e35ceed342fec843d837ba02b283398e4478d7ca71c8c73c65db5377dd0ef0aa0d10"

RPROVIDES:${PN} += "celt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcelt0-2 \
libcelt0.so.2 \
libogg.so.0"

inherit rpm
