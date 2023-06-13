SUMMARY = "The X11 Protocol collection"
DESCRIPTION = "The complete X11 protocol headers for X11 development. \
This package contains all previously split protocol packages: \
applewmproto, bigreqsproto, compositeproto, damageproto, dmxproto, dri2proto, \
dri3proto, fixesproto, fontsproto, glproto, inputproto, kbproto, presentproto, \
randrproto, recordproto, renderproto, resourceproto, scrnsaverproto, trapproto, \
videoproto, windowswmproto, xcmiscproto, xextproto, xf86bigfontproto, \
xf86dgaproto, xf86driproto, xf86miscproto, xf86vidmodeproto, xineramaproto, \
xproto and xproxymngproto."
LICENSE = "MIT"

PV = "2022.2"

RPM_NAME = "xorgproto-devel-2022.2-2.1.noarch.rpm"
RPM_HASH = "8f00419141710bc8ee5415c418cf6b61ee8aa88d25c6474ae071378a983366bc7a831d17d7693b5c99545f97a5b1c9cf317edb087bf2ffb7430b3ca7e3e0b996"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bigreqsproto-devel \
compositeproto-devel \
damageproto-devel \
dmxproto-devel \
dri2proto-devel \
dri3proto-devel \
fixesproto-devel \
fontsproto-devel \
glproto-devel \
inputproto-devel \
kbproto-devel \
pkgconfig(applewmproto) \
pkgconfig(bigreqsproto) \
pkgconfig(compositeproto) \
pkgconfig(damageproto) \
pkgconfig(dmxproto) \
pkgconfig(dpmsproto) \
pkgconfig(dri2proto) \
pkgconfig(dri3proto) \
pkgconfig(fixesproto) \
pkgconfig(fontsproto) \
pkgconfig(glproto) \
pkgconfig(inputproto) \
pkgconfig(kbproto) \
pkgconfig(presentproto) \
pkgconfig(randrproto) \
pkgconfig(recordproto) \
pkgconfig(renderproto) \
pkgconfig(resourceproto) \
pkgconfig(scrnsaverproto) \
pkgconfig(videoproto) \
pkgconfig(xcmiscproto) \
pkgconfig(xextproto) \
pkgconfig(xf86bigfontproto) \
pkgconfig(xf86dgaproto) \
pkgconfig(xf86driproto) \
pkgconfig(xf86vidmodeproto) \
pkgconfig(xineramaproto) \
pkgconfig(xproto) \
pkgconfig(xwaylandproto) \
presentproto-devel \
randrproto-devel \
recordproto-devel \
renderproto-devel \
resourceproto-devel \
scrnsaverproto-devel \
trapproto-devel \
videoproto-devel \
windowswmproto-devel \
xcmiscproto-devel \
xextproto-devel \
xf86bigfontproto-devel \
xf86dgaproto-devel \
xf86driproto-devel \
xf86miscproto-devel \
xf86vidmodeproto-devel \
xineramaproto-devel \
xorg-x11-proto-devel \
xorgproto-devel \
xproto-devel \
xproxymngproto-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig(xextproto)"

inherit rpm
