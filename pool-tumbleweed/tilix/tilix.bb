SUMMARY = "A tiling terminal emulator based on GTK+ 3"
DESCRIPTION = "A tiling terminal emulator for Linux using GTK+ 3"
LICENSE = "LGPL-3.0-only & MPL-2.0"

PV = "1.9.5"

RPM_NAME = "tilix-1.9.5-3.1.aarch64.rpm"
RPM_HASH = "9a77a29f93f0047ed82660a9f48dc263c29660d5ac097039f738bd52ac33013eff7c425cb4976c2f54467fa129d5db9937423215c0962e83a195df4272789fdc"

RPROVIDES:${PN} += "tilix"

RDEPENDS:${PN} += "/bin/bash \
libX11.so.6 \
libc.so.6 \
libdruntime-ldc-shared.so.102 \
libgcc-s.so.1 \
libgtkd-3.so.0 \
libm.so.6 \
libphobos2-ldc-shared.so.102 \
libvted-3.so.0"

inherit rpm
