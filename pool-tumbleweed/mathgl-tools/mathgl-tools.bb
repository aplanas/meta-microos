SUMMARY = "Command line tools for the MathGL library"
DESCRIPTION = "This package contains command line tools for making scientific graphics."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-tools-8.0.1-4.2.aarch64.rpm"
RPM_HASH = "c6c953aefd7e56934311c451253690f640c671791177fa07a429d82112003d632512efd342d254195e005c21c95a0823555c6b616c30f9ba6755bb7c6b0981ec"

RPROVIDES:${PN} += "mathgl-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmgl-fltk.so.8 \
libmgl.so.8 \
libstdc++.so.6"

inherit rpm
