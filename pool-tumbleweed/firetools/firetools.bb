SUMMARY = "GUI for Firajail security sandbox"
DESCRIPTION = "Firetools is the graphical user interface of Firejail security sandbox."
LICENSE = "GPL-2.0-only"

PV = "0.9.72"

RPM_NAME = "firetools-0.9.72-1.4.aarch64.rpm"
RPM_HASH = "ea35035281341c047c1ec195ffbf3e5e11177f9bb0feb4879f7e47e9cc9087543fd596c86fb4f72bdfd3740cc63b526423bbc55136f8545946e8343f61745151"

RPROVIDES:${PN} += "firetools"

RDEPENDS:${PN} += "firejail \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
