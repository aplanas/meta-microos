SUMMARY = "Utility to alter a monitor's gamma correction through the X server"
DESCRIPTION = "xgamma allows X users to query and alter the gamma correction of a \
monitor via the X video mode extension (XFree86-VidModeExtension)."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "xgamma-1.0.7-1.2.aarch64.rpm"
RPM_HASH = "ad297c610fe78ca5facf00e8fa8862ad2eaa762e3ab296894a77f337c99f00ae4faec1f00e8a10a8e267e73cb01c5b2ae9c31951b1b2db79b59009d24ba27173"

RPROVIDES:${PN} += "xgamma \
xgamma(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXxf86vm.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
