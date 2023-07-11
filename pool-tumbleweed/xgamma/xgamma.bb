SUMMARY = "Utility to alter a monitor's gamma correction through the X server"
DESCRIPTION = "xgamma allows X users to query and alter the gamma correction of a \
monitor via the X video mode extension (XFree86-VidModeExtension)."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "xgamma-1.0.7-1.3.aarch64.rpm"
RPM_HASH = "6643c4845e17484e7f7efe2b44d8122982536f3efd830bc77f98d9e23a334db3afeab362f500f373c708ffd9f7975db6ec43c73bc524cd9a782ec85e272ac61a"

RPROVIDES:${PN} += "xgamma"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXxf86vm.so.1 \
libc.so.6"

inherit rpm
