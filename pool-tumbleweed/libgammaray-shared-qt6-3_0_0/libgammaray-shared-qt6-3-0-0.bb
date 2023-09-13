SUMMARY = "Shared Gammaray libraries used by either gammaray or gammaray-qt6"
DESCRIPTION = "This package provides libraries required by gammaray-qt6-shared-plugins"
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "libgammaray-shared-qt6-3_0_0-3.0.0-1.1.aarch64.rpm"
RPM_HASH = "b61f33e158aee6f496423487460b30181083eda1f6a2b2fccb23910ebadce728fcbc33ebb4df03d1d65d521c30bfb608d46c21a54a37f3f18a72889e04fd6f60"

RPROVIDES:${PN} += "libgammaray-common-qt6-5-aarch64.so.3.0.0 \
libgammaray-core-qt6-5-aarch64.so.3.0.0 \
libgammaray-kitemmodels-qt6-5-aarch64.so.3.0.0 \
libgammaray-shared-qt6-3-0-0 \
libgammaray-ui-qt6-5-aarch64.so.3.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libdw.so.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
