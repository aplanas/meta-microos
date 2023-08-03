SUMMARY = "Qt 5 PBF Image Format Plugin"
DESCRIPTION = "Qt image plugin for displaying Mapbox vector tiles."
LICENSE = "LGPL-3.0-only"

PV = "2.4"

RPM_NAME = "libqt5-qtpbfimageformat-2.4-3.1.aarch64.rpm"
RPM_HASH = "702cfc12359badbb32fb63c72d362aa0985e4af8c3b75d2d1e69bbd3be8db755181491676b571985e9b3ae550e6f35c8fdb2cb9b7a94196536444995c9e5ac9e"

RPROVIDES:${PN} += "libpbf.so \
libqt5-qtpbfimageformat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libabsl-log-internal-check-op.so.2301.0.0 \
libabsl-log-internal-message.so.2301.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libprotobuf-lite.so.23.4.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
