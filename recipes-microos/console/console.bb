SUMMARY = "A simple user-friendly terminal emulator for the GNOME desktop"
DESCRIPTION = "A simple user-friendly terminal emulator for the GNOME desktop."
LICENSE = "GPL-3.0-only"

PV = "44.0"

RPM_NAME = "console-44.0-1.1.aarch64.rpm"
RPM_HASH = "f0459e0bbe2ddeb2fd17dc2030b2af489a36429b8aab1286e98a7660b48d86b3c5ed588ffc0195a6679c0fbd69dbe75a501be8124f08f681b1cdbb2454810947"

RPROVIDES:${PN} += "application() application(org.gnome.Console.desktop) console console(aarch-64) metainfo() metainfo(org.gnome.Console.metainfo.xml) nautilus-extension-console"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libadwaita-1.so.0()(64bit) libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-4.so.1()(64bit) libgtop-2.0.so.11()(64bit) libpango-1.0.so.0()(64bit) libvte-2.91-gtk4.so.0()(64bit)"

inherit rpm
