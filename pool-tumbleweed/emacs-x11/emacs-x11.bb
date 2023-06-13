SUMMARY = "GNU Emacs: Emacs binary with X Window System Support"
DESCRIPTION = "Call it \
 \
Emacs \
 \
Love it or leave it. This is the Emacs binary with X Window System \
Support."
LICENSE = "GPL-3.0-or-later"

PV = "28.2"

RPM_NAME = "emacs-x11-28.2-4.2.aarch64.rpm"
RPM_HASH = "f8525cf8a8b7f5b6a12670b74439f477abae64c3c6d9ef585762b6a4828fc3141a88a7054294b4a5844c6575545f3ec6033e265724fc6de817514c773d177f16"

RPROVIDES:${PN} += "application() \
application(emacs-mail.desktop) \
application(emacs.desktop) \
application(emacsclient-mail.desktop) \
application(emacsclient.desktop) \
emacs-x11 \
emacs-x11(aarch-64) \
emacs_program \
metainfo() \
metainfo(emacs.metainfo.xml) \
mimehandler(application/x-shellscript) \
mimehandler(text/english) \
mimehandler(text/plain) \
mimehandler(text/x-c) \
mimehandler(text/x-c++) \
mimehandler(text/x-c++hdr) \
mimehandler(text/x-c++src) \
mimehandler(text/x-chdr) \
mimehandler(text/x-csrc) \
mimehandler(text/x-java) \
mimehandler(text/x-makefile) \
mimehandler(text/x-moc) \
mimehandler(text/x-pascal) \
mimehandler(text/x-tcl) \
mimehandler(text/x-tex) \
mimehandler(x-scheme-handler/mailto)"

RDEPENDS:${PN} += "/bin/sh \
emacs \
emacs-eln \
fileutils \
gnu-unifont-bitmap-fonts \
ifnteuro \
ld-linux-aarch64.so.1()(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libXaw3d.so.8()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXinerama.so.1()(64bit) \
libXmu.so.6()(64bit) \
libXpm.so.4()(64bit) \
libXrandr.so.2()(64bit) \
libXrender.so.1()(64bit) \
libXt.so.6()(64bit) \
libacl.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgccjit.so.0()(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_0)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_1)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_11)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_13)(64bit) \
libgccjit.so.0(LIBGCCJIT_ABI_14)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgif.so.7()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmp.so.10()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libjansson.so.4()(64bit) \
libjavascriptcoregtk-4.0.so.18()(64bit) \
libjpeg.so.8()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm17n-core.so.0()(64bit) \
libm17n-flt.so.0()(64bit) \
libotf.so.1()(64bit) \
libpango-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
librsvg-2.so.2()(64bit) \
libselinux.so.1()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libtiff.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libwebkit2gtk-4.0.so.37()(64bit) \
libxcb.so.1()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit) \
xorg-x11-fonts \
xorg-x11-fonts-core"

inherit rpm
