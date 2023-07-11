SUMMARY = "A set of tools for the opus audio codec"
DESCRIPTION = "The Opus codec is designed for interactive speech and audio transmission over \
the Internet. It is designed by the IETF Codec Working Group and incorporates \
technology from Skype's SILK codec and Xiph.Org's CELT codec. \
 \
This is a set of tools for the opus codec."
LICENSE = "BSD-2-Clause & GPL-2.0-only"

PV = "0.2"

RPM_NAME = "opus-tools-0.2-1.22.aarch64.rpm"
RPM_HASH = "770b424f7fc83735539a58df38b14d380fa29b015a92e9f61c303900d6ee43002215f2160841d210beeea2db7ecc317cbdc516d30f0529e91d353bdec374faa2"

RPROVIDES:${PN} += "opus-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libc.so.6 \
libm.so.6 \
libogg.so.0 \
libopus.so.0 \
libopusenc.so.0 \
libopusfile.so.0 \
libopusurl.so.0"

inherit rpm
