SUMMARY = "Light Weight UI for Fcitx"
DESCRIPTION = "Fcitx-ui-light provides an alternative light weight UI for Fcitx, only using Xpm and Xft. \
if you are not a light weight desktop environment user, strongly recommends you to use the normal 'fcitx' package."
LICENSE = "GPL-2.0+"

PV = "0.1.3"

RPM_NAME = "fcitx-ui-light-0.1.3-11.24.aarch64.rpm"
RPM_HASH = "1032bdb484146933a94e805f59f902a4ec997b027f9ca371c82f421be0666c0ced54c1726201e05535cb92368e054c1bdd7e3246ba507169ec28799e784adac3"

RPROVIDES:${PN} += "fcitx-ui-light"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libXpm.so.4 \
libc.so.6 \
libfontconfig.so.1"

inherit rpm
