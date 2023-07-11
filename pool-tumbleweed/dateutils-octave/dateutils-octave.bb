SUMMARY = "Dateutils functions for matlab and octave"
DESCRIPTION = "Dateutils can be used from within matlab or ocatave."
LICENSE = "BSD-3-Clause"

PV = "0.4.10"

RPM_NAME = "dateutils-octave-0.4.10-2.4.aarch64.rpm"
RPM_HASH = "9adb7d98b71d783198cb4e4240001ea56b2122b617ab07b764cc21399ada91e9a1a2862d35b7838f67abd7fafd40a81d2ba24bbff9932116754b048b6eec2843"

RPROVIDES:${PN} += "dateutils-octave"

RDEPENDS:${PN} += "dateutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
octave"

inherit rpm
