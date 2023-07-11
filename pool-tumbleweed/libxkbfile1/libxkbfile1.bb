SUMMARY = "X11 keyboard file manipulation library"
DESCRIPTION = "libxkbfile is used by the X servers and utilities to parse the XKB \
configuration data files."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "libxkbfile1-1.1.2-1.3.aarch64.rpm"
RPM_HASH = "773def50ce41aba6eb207c640aaa8266b41e2da3053df0d1d7b0a61db17dae2b28988fecea069d14db4b9149123790aa7444b8de21d6df3adcc407b4c5e983da"

RPROVIDES:${PN} += "libxkbfile.so.1 \
libxkbfile1 \
xorg-x11-libxkbfile"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
xkeyboard-config"

inherit rpm
