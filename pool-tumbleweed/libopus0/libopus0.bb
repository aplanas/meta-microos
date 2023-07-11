SUMMARY = "Opus Audio Codec Library"
DESCRIPTION = "The Opus codec is designed for interactive speech and audio transmission over \
the Internet. It is designed by the IETF Codec Working Group and incorporates \
technology from Skype's SILK codec and Xiph.Org's CELT codec."
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "libopus0-1.4-1.2.aarch64.rpm"
RPM_HASH = "a1ee58511233d2271daa69d4985542c4cb474904cb4562424b3cd59a9e4cb4f28c73dac78b43cab60aa933aed1067b7ece2ec2f1c700115f0d63529519a8e121"

RPROVIDES:${PN} += "libopus.so.0 \
libopus0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
