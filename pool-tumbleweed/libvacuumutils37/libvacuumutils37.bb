SUMMARY = "Shared library libvacuumutils for Vacuum-IM"
DESCRIPTION = "This package includes shared libraris needed to work Vacuum-IM program."
LICENSE = "GPL-3.0-only"

PV = "1.3.0+git1571036065.9f3952b2"

RPM_NAME = "libvacuumutils37-1.3.0+git1571036065.9f3952b2-1.20.aarch64.rpm"
RPM_HASH = "546d43af5906777d30e7c20afad53a9859f0205ba0672c7b438ca244c1fcd3b40bb84552c3e79e73b6d83a1a00135e3d45e64c7a349358a4bb1c7a0dc9a29385"

RPROVIDES:${PN} += "libvacuumutils.so.37 \
libvacuumutils37"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libX11.so.6 \
libXss.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libminizip.so.1 \
libqxtglobalshortcut.so.0 \
libstdc++.so.6"

inherit rpm
