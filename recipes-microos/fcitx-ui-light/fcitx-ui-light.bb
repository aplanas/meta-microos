SUMMARY = "Light Weight UI for Fcitx"
DESCRIPTION = "Fcitx-ui-light provides an alternative light weight UI for Fcitx, only using Xpm and Xft. \
if you are not a light weight desktop environment user, strongly recommends you to use the normal 'fcitx' package."
LICENSE = "GPL-2.0+"

PV = "0.1.3"

RPM_NAME = "fcitx-ui-light-0.1.3-11.23.aarch64.rpm"
RPM_HASH = "6a6761783b2fb271d5f532167f5b2687e06372d579b2a7505995e6e84df58b8b154c3125f283af330a0aeeac0cf2ae96755c83daf8ba3c4d49a759491ff04620"

RPROVIDES:${PN} += "application() \
application(fcitx-light.desktop) \
fcitx-ui-light \
fcitx-ui-light(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXft.so.2()(64bit) \
libXpm.so.4()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libfontconfig.so.1()(64bit)"

inherit rpm
