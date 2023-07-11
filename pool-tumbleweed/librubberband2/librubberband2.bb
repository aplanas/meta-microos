SUMMARY = "Audio time-stretching and pitch-shifting library"
DESCRIPTION = "Rubber Band is a library and utility program that permits you to change the \
tempo and pitch of an audio recording independently of one another."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.0"

RPM_NAME = "librubberband2-3.1.0-1.4.aarch64.rpm"
RPM_HASH = "47973be2cc02b9a8f475733eda4b97f35995c9a9fd7bd5848435152f1f213ffc2eed4e5d5ebb0ad42e9b8c90f0456a3cf47486b49b7d3701667e09db0df60b38"

RPROVIDES:${PN} += "librubberband.so.2 \
librubberband2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
