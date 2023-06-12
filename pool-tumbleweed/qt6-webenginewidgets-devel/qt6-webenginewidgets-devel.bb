SUMMARY = "Development files for the Qt 6 WebEngineWidgets library"
DESCRIPTION = "Development files for the Qt 6 WebEngineWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webenginewidgets-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f6d148bb69cb71eef520f7ed486de956ac6d81f72e7409e629cb6f379beb030d0eaacad103425192783ba921017bca3443cd60c535b4c2c5b2c383e74ea45622"

RPROVIDES:${PN} += "cmake(Qt6WebEngineWidgets) \
pkgconfig(Qt6WebEngineWidgets) \
qt6-webenginewidgets-devel \
qt6-webenginewidgets-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Gui) \
cmake(Qt6PrintSupport) \
cmake(Qt6QuickWidgets) \
cmake(Qt6WebEngineCore) \
libQt6WebEngineWidgets6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6PrintSupport) \
pkgconfig(Qt6WebEngineCore) \
pkgconfig(Qt6Widgets) \
qt6-quick-private-devel"

inherit rpm
