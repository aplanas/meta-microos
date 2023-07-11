SUMMARY = "Mouse Event to Key Event Mapper Daemon"
DESCRIPTION = "A daemon for X11, which watches for mouse wheel actions and outputs them as \
keypresses. It can be configured separately for different windows. It also \
allows input from it's own (included) gpm, or from jamd, or from XFree86 ZAxis \
mouse wheel conversion."
LICENSE = "GPL-2.0+"

PV = "1.0.0pre12"

RPM_NAME = "imwheel-1.0.0pre12-6.26.aarch64.rpm"
RPM_HASH = "1f56b27889b539561e2103d0dde28875f59ae685cf37a1cfee70c42eb6c41c31779fbc4cd6de2962351437b9ec980501de208f91d8527801943a32a582f6125e"

RPROVIDES:${PN} += "config-imwheel \
imwheel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXmu.so.6 \
libXtst.so.6 \
libc.so.6"

inherit rpm
