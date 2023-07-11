SUMMARY = "GNU Emacs: Emacs binary with X Window System Support"
DESCRIPTION = "Call it \
 \
Emacs \
 \
Love it or leave it. This is the Emacs binary with X Window System \
Support."
LICENSE = "GPL-3.0-or-later"

PV = "28.2"

RPM_NAME = "emacs-x11-28.2-4.3.aarch64.rpm"
RPM_HASH = "50c7e6a4e9f298ba59c94202bcd92a9763838cc0c664ccb14c86b8a1011d642eff17d7b9873b55c9924d372e903ef62691153ff24ee6d8b5c02274ae6d8cd2d5"

RPROVIDES:${PN} += "emacs-program \
emacs-x11"

RDEPENDS:${PN} += "/usr/bin/sh \
emacs \
emacs-eln \
fileutils \
gnu-unifont-bitmap-fonts \
ifnteuro \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11-xcb.so.1 \
libX11.so.6 \
libXaw3d.so.8 \
libXext.so.6 \
libXfixes.so.3 \
libXinerama.so.1 \
libXmu.so.6 \
libXpm.so.4 \
libXrandr.so.2 \
libXrender.so.1 \
libXt.so.6 \
libacl.so.1 \
libasound.so.2 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgccjit.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgif.so.7 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libharfbuzz.so.0 \
libjansson.so.4 \
libjavascriptcoregtk-4.0.so.18 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libm17n-core.so.0 \
libm17n-flt.so.0 \
libotf.so.1 \
libpango-1.0.so.0 \
libpng16.so.16 \
librsvg-2.so.2 \
libselinux.so.1 \
libsystemd.so.0 \
libtiff.so.6 \
libtinfo.so.6 \
libwebkit2gtk-4.0.so.37 \
libxcb.so.1 \
libxml2.so.2 \
libz.so.1 \
xorg-x11-fonts \
xorg-x11-fonts-core"

inherit rpm
