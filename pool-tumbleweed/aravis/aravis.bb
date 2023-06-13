SUMMARY = "Glib/gobject based library implementing a Genicam interface"
DESCRIPTION = "Aravis is a glib/gobject based library implementing a Genicam interface, \
which can be used for the acquisition of video streams coming from either \
ethernet, firewire or USB cameras. It currently only implements an ethernet \
camera protocol used for industrial cameras."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.26"

RPM_NAME = "aravis-0.8.26-1.1.aarch64.rpm"
RPM_HASH = "5440945a46285e64cb5250f5cf1dfbed9dd0140e6ab2707c08a49ff928d51e8079ab39fb1afd0c1b333b03aae62843873bd28ffb49a7113f0ab0dea7703898bf"

RPROVIDES:${PN} += "aravis \
aravis(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaravis-0.8.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
