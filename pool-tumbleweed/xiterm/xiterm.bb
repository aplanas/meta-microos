SUMMARY = "Internationalized Terminal Emulator for X11"
DESCRIPTION = "Internationalized Terminal Emulator for X11"
LICENSE = "SUSE-CPL-0.5"

PV = "0.5.20040304"

RPM_NAME = "xiterm-0.5.20040304-301.9.aarch64.rpm"
RPM_HASH = "b9d7360e3cf13c5546e3d538e3a8b07c4dea317f818f2d260c692b464142d5ad04c71b06cced0f69d2d637cfffbd017791374016258a877bed85d2516c4eb3e4"

RPROVIDES:${PN} += "locale(xorg-x11:ja;ko;zh) \
xiterm \
xiterm(aarch-64)"

RDEPENDS:${PN} += "group(tty) \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXiterm.so.1()(64bit) \
libXmu.so.6()(64bit) \
libXt.so.6()(64bit) \
libc.so.6()(64bit) \
libiterm.so.1()(64bit)"

inherit rpm
