SUMMARY = "Qt 5 PBF Image Format Plugin"
DESCRIPTION = "Qt image plugin for displaying Mapbox vector tiles."
LICENSE = "LGPL-3.0-only"

PV = "2.4"

RPM_NAME = "libqt5-qtpbfimageformat-2.4-3.2.aarch64.rpm"
RPM_HASH = "00c1b8da47c12a6412972554f7b4fcadac6bb8865571136a559cb0970b38f6167183d9e1bb5ea1d64497a55a7a9ce834359ab1d8497207b6b7b8cceefc2365a7"

RPROVIDES:${PN} += "libpbf.so \
libqt5-qtpbfimageformat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libabsl-log-internal-check-op.so.2308.0.0 \
libabsl-log-internal-message.so.2308.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libprotobuf-lite.so.23.4.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
