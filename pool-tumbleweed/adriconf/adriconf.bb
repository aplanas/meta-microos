SUMMARY = "Advanced DRI Configurator"
DESCRIPTION = "adriconf (Advanced DRI CONFigurator) is a GUI tool used to configure open \
source graphics drivers. It works by setting options and writing them to \
the standard drirc file used by the Mesa drivers."
LICENSE = "GPL-3.0-only"

PV = "2.7.0"

RPM_NAME = "adriconf-2.7.0-1.1.aarch64.rpm"
RPM_HASH = "3b7d3abb4a4b9abaf2fa2fa127aee8485b45a238fb156eaa0789aa9912fedac87d8ba7b581d633cf4d9906ed8f02d1d88491c1453fb1cfd13a2d60e8a6fd6796"

RPROVIDES:${PN} += "adriconf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libgiomm-2.68.so.1 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgtkmm-4.0.so.0 \
libpci.so.3 \
libpugixml.so.1 \
libsigc-3.0.so.0 \
libstdc++.so.6"

inherit rpm
