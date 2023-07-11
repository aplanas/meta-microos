SUMMARY = "Shared library libvacuumutils for Vacuum-IM"
DESCRIPTION = "This package includes shared libraris needed to work Vacuum-IM program."
LICENSE = "GPL-3.0-only"

PV = "1.3.0+git1571036065.9f3952b2"

RPM_NAME = "libvacuumutils37-1.3.0+git1571036065.9f3952b2-1.21.aarch64.rpm"
RPM_HASH = "f44d3b0edcbcf706dde6e41fdbbf4846bd2bd8be5ba5ffbbf530e0b47327aec8c08f865bf9b20b4aac8def78dad9d09ef2dec7574c23274ff7042c64aae1d274"

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
