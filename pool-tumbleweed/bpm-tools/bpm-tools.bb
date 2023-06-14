SUMMARY = "Automatic calculating and tagging the tempo of music files"
DESCRIPTION = "Automatic calculating and tagging the tempo (in beats-per-minute) of music files."
LICENSE = "GPL-2.0+"

PV = "0.3"

RPM_NAME = "bpm-tools-0.3-1.24.aarch64.rpm"
RPM_HASH = "1c8fbc227f197ce537f991184b032ce8fd34f462fb06c5cd9936ec896c7850466d5cdfa0226139f6331f068d4167d4a49bef26fd34ae63240de443ce0f68f3a1"

RPROVIDES:${PN} += "bpm-tools"

RDEPENDS:${PN} += "/bin/sh \
gnuplot \
ld-linux-aarch64.so.1 \
libc.so.6 \
sox"

inherit rpm
