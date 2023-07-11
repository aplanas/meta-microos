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

RPM_NAME = "lshw-gui-B.02.19.2+git.20230320-1.2.aarch64.rpm"
RPM_HASH = "64f2c16a610de94d7608f07381f8baa8a3475188d9a505683a765f296cbbb7aa231bc12141533482afe1513fd2620a43045fa432438af95525a330bba32786cf"

RPROVIDES:${PN} += "lshw-gui"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libstdc++.so.6 \
lshw \
update-desktop-files"

inherit rpm
