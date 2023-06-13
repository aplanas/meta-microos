SUMMARY = "HardWare LiSter (GUI Frontend)"
DESCRIPTION = "lshw (Hardware Lister) is a small tool to provide detailed informaton on the \
hardware configuration of the machine. It can report exact memory \
configuration, firmware version, mainboard configuration, CPU version and \
speed, cache config uration, bus speed, etc. on DMI-capable x86 systems and \
on some PowerPC machines (PowerMac G4 is known to work). \
 \
This package provides a graphical user interface to display hardware \
information. \
 \
For detailed information on lshw features and usage, please see the \
included documentation or go to the lshw Web page, \
http://www.ezix.org/software/lshw.html"
LICENSE = "GPL-2.0-only"

PV = "B.02.19.2+git.20230320"

RPM_NAME = "lshw-gui-B.02.19.2+git.20230320-1.1.aarch64.rpm"
RPM_HASH = "dabec9e99c25bdc5f63ad262450ab4784a0a3ca57eb97a2af2ec254e5c715a9650718c1c6d32465d49c6f26b5fd77b26c309f9981bb1485ce4db846a7e62e0e0"

RPROVIDES:${PN} += "application() \
application(lshw.desktop) \
lshw-gui \
lshw-gui(aarch-64)"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
lshw \
update-desktop-files"

inherit rpm
