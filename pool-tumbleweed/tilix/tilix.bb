SUMMARY = "A tiling terminal emulator based on GTK+ 3"
DESCRIPTION = "A tiling terminal emulator for Linux using GTK+ 3"
LICENSE = "LGPL-3.0-only & MPL-2.0"

PV = "1.9.5"

RPM_NAME = "tilix-1.9.5-3.1.aarch64.rpm"
RPM_HASH = "9a77a29f93f0047ed82660a9f48dc263c29660d5ac097039f738bd52ac33013eff7c425cb4976c2f54467fa129d5db9937423215c0962e83a195df4272789fdc"

RPROVIDES:${PN} += "application() \
application(com.gexperts.Tilix.desktop) \
metainfo() \
metainfo(com.gexperts.Tilix.appdata.xml) \
tilix \
tilix(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libdruntime-ldc-shared.so.102()(64bit) \
libgcc_s.so.1()(64bit) \
libgtkd-3.so.0()(64bit) \
libm.so.6()(64bit) \
libphobos2-ldc-shared.so.102()(64bit) \
libvted-3.so.0()(64bit)"

inherit rpm
