SUMMARY = "Bit-accurate C port of Impulse Tracker 2.15's IT replayer"
DESCRIPTION = "Bit-accurate C port of Impulse Tracker 2.15's IT replayer. \
This is a direct port of the original asm source codes."
LICENSE = "BSD-3-Clause"

PV = "0~git20230215"

RPM_NAME = "it2play-0~git20230215-1.3.aarch64.rpm"
RPM_HASH = "697ca2f94ec07218b48249d04255893c8f9361774cb7940bc9187109e50b9e43d9300c6712b9572b2b5b30a0494a14aecbb43dcf2187878801efae33aca94597"

RPROVIDES:${PN} += "it2play"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
