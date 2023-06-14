SUMMARY = "Flexible screenshotting utility"
DESCRIPTION = "maim (Make Image) is a utility that takes screenshots of the desktop \
using EGL. It is meant to overcome shortcomings of the 'scrot' \
utility and performs better in several ways."
LICENSE = "GPL-3.0-or-later"

PV = "5.7.4"

RPM_NAME = "maim-5.7.4-1.14.aarch64.rpm"
RPM_HASH = "184c5fe387ab24bc7e4f85f0fb14b2e18323399759cd0656d672ed33cb23cf91df3c8530c1292cf568682938bafe912fda0b084bca4f20b7f9bd2b9c217ce13f"

RPROVIDES:${PN} += "maim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXrandr.so.2 \
libXrender.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.73 \
libjpeg.so.8 \
libpng16.so.16 \
libslopy.so.7.6 \
libstdc++.so.6 \
libwebp.so.7"

inherit rpm
