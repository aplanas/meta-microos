SUMMARY = "Support programs for the open source SDR hardware"
DESCRIPTION = "Tools for HackRF, an open source hardware project to build a Software \
Defined Radio (SDR) peripheral."
LICENSE = "GPL-2.0-only"

PV = "2023.01.1"

RPM_NAME = "hackrf-2023.01.1-1.3.aarch64.rpm"
RPM_HASH = "3bc0389358c4d2db704cc8f5ca65c2b63c2a471e3e636a926346122b077ca134a676494508fdd405213156cf54f9d293d6f7307325e6b876fce8f2b9c3c153a9"

RPROVIDES:${PN} += "hackrf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3f.so.3 \
libhackrf.so.0 \
libm.so.6"

inherit rpm
