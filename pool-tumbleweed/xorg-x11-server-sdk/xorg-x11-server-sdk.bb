SUMMARY = "X"
DESCRIPTION = "This package contains the X.Org Server SDK."
LICENSE = "MIT"

PV = "21.1.8"

RPM_NAME = "xorg-x11-server-sdk-21.1.8-1.3.aarch64.rpm"
RPM_HASH = "2624b576049d4fc73ad5ccd4b195dbf823c18bcee68676d30540eaaf2ba61915d7f1efc1f34926693e608e19073aa0bd332a5b42dc0335fffd80f552fbef0e24"

RPROVIDES:${PN} += "glamor-devel \
pkgconfig-xorg-server \
rpm-macro-x11-abi-ansic-req \
rpm-macro-x11-abi-extension-req \
rpm-macro-x11-abi-has-dpms-get-capabilities \
rpm-macro-x11-abi-videodrv-req \
rpm-macro-x11-abi-xinput-req \
xorg-x11-sdk \
xorg-x11-server-sdk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
autoconf \
automake \
c-compiler \
libtool \
pkgconfig-dri \
pkgconfig-dri2proto \
pkgconfig-dri3proto \
pkgconfig-fontconfig \
pkgconfig-fontenc \
pkgconfig-fontsproto \
pkgconfig-freetype2 \
pkgconfig-glproto \
pkgconfig-ice \
pkgconfig-inputproto \
pkgconfig-kbproto \
pkgconfig-libdrm \
pkgconfig-libevdev \
pkgconfig-libudev \
pkgconfig-libxcvt \
pkgconfig-mtdev \
pkgconfig-pciaccess \
pkgconfig-pixman-1 \
pkgconfig-presentproto \
pkgconfig-randrproto \
pkgconfig-renderproto \
pkgconfig-resourceproto \
pkgconfig-scrnsaverproto \
pkgconfig-sm \
pkgconfig-videoproto \
pkgconfig-x11 \
pkgconfig-xau \
pkgconfig-xdmcp \
pkgconfig-xext \
pkgconfig-xextproto \
pkgconfig-xf86driproto \
pkgconfig-xfixes \
pkgconfig-xineramaproto \
pkgconfig-xkbfile \
pkgconfig-xmu \
pkgconfig-xorg-macros \
pkgconfig-xp \
pkgconfig-xpm \
pkgconfig-xprintutil \
pkgconfig-xproto \
pkgconfig-xrender \
pkgconfig-xt \
pkgconfig-xtrans \
pkgconfig-xv \
xorg-x11-server"

inherit rpm
