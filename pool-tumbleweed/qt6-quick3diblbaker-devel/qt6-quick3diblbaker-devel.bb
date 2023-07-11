SUMMARY = "Qt6 Quick3DIblBaker library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DIblBaker library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3diblbaker-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "34bbc293939932497ae6105c6699bde7a626f89e34dd2aaf9bc428128dc0515075b45349e8671ae83a9aeef7bcf7ef4446df0da0946cd31ea0efe064f7558c48"

RPROVIDES:${PN} += "cmake-Qt6Quick3DIblBaker \
pkgconfig-Qt6Quick3DIblBaker \
qt6-quick3diblbaker-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Quick3DRuntimeRender \
libQt6Quick3DIblBaker6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3DRuntimeRender"

inherit rpm
