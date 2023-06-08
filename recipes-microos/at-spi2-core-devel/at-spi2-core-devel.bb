SUMMARY = "Development files for the Assistive Technology Service Provider Interface"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.0"

RPM_NAME = "at-spi2-core-devel-2.48.0-1.1.aarch64.rpm"
RPM_HASH = "16259a86c50b28ca1ffe6942106b87b86530f9d89e89510261eb41ff581ecc07e81cf5ef413a93776e7fbb3c7e98112b825580caae9bfe1740b7daba12ba953e"

RPROVIDES:${PN} += "at-spi2-core-devel at-spi2-core-devel(aarch-64) pkgconfig(atk) pkgconfig(atk-bridge-2.0) pkgconfig(atspi-2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config at-spi2-core libatk-1_0-0 libatk-bridge-2_0-0 libatspi0 pkgconfig(atk) pkgconfig(atspi-2) pkgconfig(dbus-1) pkgconfig(glib-2.0) pkgconfig(gmodule-2.0) pkgconfig(gobject-2.0) pkgconfig(x11) pkgconfig(xi) pkgconfig(xtst) typelib-1_0-Atk-1_0 typelib-1_0-Atspi-2_0"

inherit rpm
