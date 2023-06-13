SUMMARY = "Task Switcher"
DESCRIPTION = "alttab is a X11 window switcher designed for minimalistic window managers or standalone X11 session."
LICENSE = "GPL-3.0-only"

PV = "1.7.1"

RPM_NAME = "alttab-1.7.1-1.1.aarch64.rpm"
RPM_HASH = "e5235447bc72e9ec668c35f764ce894f9e51f36a8cff3e7661cda79bc56f08c15d78c2c4a9bc101c8afbb55780fd5f332c827785349261501cd186062195dce5"

RPROVIDES:${PN} += "alttab \
alttab(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXft.so.2()(64bit) \
libXpm.so.4()(64bit) \
libXrandr.so.2()(64bit) \
libXrender.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
