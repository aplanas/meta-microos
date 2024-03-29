SUMMARY = "Utility to display information about an X server"
DESCRIPTION = "xdpyinfo is a utility for displaying information about an X server. \
 \
It is used to examine the capabilities of a server, the predefined \
values for various parameters used in communicating between clients \
and the server, and the different types of screens, visuals, and X11 \
protocol extensions that are available."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "xdpyinfo-1.3.4-1.1.aarch64.rpm"
RPM_HASH = "937d1bab0dcbd83d7ec127d30fd8768e1b33b38719e6bdcdf89dc25b057d386d40c73c496d2a774be02fb47118dd100843813b15b0cc8facd1f027a4116b3959"

RPROVIDES:${PN} += "xdpyinfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXext.so.6 \
libXi.so.6 \
libXinerama.so.1 \
libXrender.so.1 \
libXtst.so.6 \
libXxf86dga.so.1 \
libXxf86vm.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
