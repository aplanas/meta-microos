SUMMARY = "Sndio output plugin for the C* Music Player"
DESCRIPTION = "This package provides sndio output support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-sndio-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "37a0b9ec4abc9659872d2e23d9d963b2792107c13b3526beb458d19157725fd1e65661ccb8d2f326b8647167c0cdda633f4048a1308473d6af7e9ca7a8baa47f"

RPROVIDES:${PN} += "cmus-plugin-sndio \
cmus-plugin-sndio(aarch-64)"

RDEPENDS:${PN} += "cmus \
libsndio.so.7.1()(64bit)"

inherit rpm
