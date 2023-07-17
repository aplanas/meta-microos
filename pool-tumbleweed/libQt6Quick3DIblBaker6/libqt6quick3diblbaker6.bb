SUMMARY = "Qt 6 Quick3DIblBaker library"
DESCRIPTION = "The Qt 6 Quick3DIblBaker library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DIblBaker6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "0f6dbaaa14643df916ce515d7b5706570e01d5bb56a50d98d6f8b32e87584532455d0656d266847ca6127bc397631985071df699f1d8cf8cc154a68fc5d25522"

RPROVIDES:${PN} += "libQt6Quick3DIblBaker.so.6 \
libQt6Quick3DIblBaker6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Quick3DRuntimeRender.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
