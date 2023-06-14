SUMMARY = "Small audio and MIDI framework"
DESCRIPTION = "This package contains the controller binary for sndio."
LICENSE = "ISC"

PV = "1.7.0"

RPM_NAME = "sndioctl-1.7.0-1.10.aarch64.rpm"
RPM_HASH = "027191f50c4c0bd7973fd9c363465d48b3622ce8413ff789622256c2d589281a62ce1d632f2150de15b51147962dc137d1964cd40132a36376f06dd0798e1ead"

RPROVIDES:${PN} += "sndioctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsndio.so.7.1 \
libsndio7-1"

inherit rpm
