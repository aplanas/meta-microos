SUMMARY = "GUI for Firajail security sandbox"
DESCRIPTION = "Firetools is the graphical user interface of Firejail security sandbox."
LICENSE = "GPL-2.0-only"

PV = "0.9.72"

RPM_NAME = "firetools-0.9.72-1.3.aarch64.rpm"
RPM_HASH = "8daeab764a4db63d07d9c510298df1120b03f4289f3209377c64cc2db16df6f6a72531a6f14022848d8a6e69440b776697b334d47a2deeabc3de54794c0d89d6"

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
