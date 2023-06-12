SUMMARY = "Development files for the X11 keyboard UI presentation library"
DESCRIPTION = "libxkbui provides an interface to easily present XKB layouts as \
graphical widgets. \
 \
This package contains the development headers for the library found \
in libxkbui1."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "libxkbui-devel-1.0.2-13.1.aarch64.rpm"
RPM_HASH = "8c9a68fd569530d54c52a4843479de05453c84ec7fa4bbc6635f92522b583213211375ed244f59f993af17b62309c496be455788b48e737b6081d12e83e71996"

RPROVIDES:${PN} += "libxkbui-devel \
libxkbui-devel(aarch-64) \
pkgconfig(xkbui)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxkbui1 \
pkgconfig(kbproto) \
pkgconfig(x11) \
pkgconfig(xt)"

inherit rpm
