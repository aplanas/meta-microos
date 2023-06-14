SUMMARY = "Displays colors defined in rgb.txt"
DESCRIPTION = "Xcolorsel displays colors defined in rgb.txt. You can create an RGB \
file by redirecting the output of showrgb to a file."
LICENSE = "SUSE-Public-Domain"

PV = "91.10.4"

RPM_NAME = "xcolors-91.10.4-1243.9.aarch64.rpm"
RPM_HASH = "c9314c68221dd5da713d025c5077cd33b74c9cd6f8386f83cb40252ae634ab1fe08d94ceb19964026c4dba94b44ea6dce8d7c9316c3899ebf1e091cf0ffc1898"

RPROVIDES:${PN} += "config-xcolors \
xcolors"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
