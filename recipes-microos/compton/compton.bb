SUMMARY = "A compositor for X11"
DESCRIPTION = "Compton was forked from Dana Jansens' fork of xcompmgr and refactored."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "compton-0.1.0-4.29.aarch64.rpm"
RPM_HASH = "2e4cd041c6cd97b60b63b5bf22c293ec9ae4449fde044505fecb1ff2c4edeca4b0aae4f95468de1d5013d73176a6bfc8f3e2a3080926eea7d578e049f56fdb5b"

RPROVIDES:${PN} += "application() application(compton.desktop) compton compton(aarch-64)"
RDEPENDS:${PN} += "/bin/sh desktop-file-utils hicolor-icon-theme ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libX11.so.6()(64bit) libXcomposite.so.1()(64bit) libXdamage.so.1()(64bit) libXext.so.6()(64bit) libXfixes.so.3()(64bit) libXinerama.so.1()(64bit) libXrandr.so.2()(64bit) libXrender.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libconfig.so.11()(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpcre.so.1()(64bit)"

inherit rpm
