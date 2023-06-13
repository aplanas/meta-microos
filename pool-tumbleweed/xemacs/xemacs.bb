SUMMARY = "XEmacs"
DESCRIPTION = "This is the current version of XEmacs, formerly known as Lucid-Emacs. \
It is related to other versions of Emacs, in particular GNU Emacs. Its \
emphasis is on modern graphical user interface support and an open \
software development model, similar to Linux. \
 \
Lisp macros are not necessarily interchangeable between GNU-Emacs and \
XEmacs. This is mainly important for translated .elc files and the key \
macros."
LICENSE = "GPL-3.0-or-later"

PV = "21.5.34"

RPM_NAME = "xemacs-21.5.34-22.3.aarch64.rpm"
RPM_HASH = "52e47d62f007fe887ca71819b9f14a19370c762fd01eed4168a4dbc175ce31516407e37e38088a32a17be6d64caf91b5a4bb106f033137cf84aa54383a1711a9"

RPROVIDES:${PN} += "application() \
application(xemacs.desktop) \
config(xemacs) \
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
xemacs \
xemacs(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ctags \
efont-unicode \
ifnteuro \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXau.so.6()(64bit) \
libXaw3d.so.8()(64bit) \
libXext.so.6()(64bit) \
libXmu.so.6()(64bit) \
libXpm.so.4()(64bit) \
libXt.so.6()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdb-4.8.so()(64bit) \
libgdbm_compat.so.4()(64bit) \
libgpm.so.2()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
liblber.so.2()(64bit) \
liblber.so.2(OPENLDAP_2.200)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libwnn.so.0()(64bit) \
permissions \
xemacs-info \
xemacs-packages \
xorg-x11-fonts \
xorg-x11-fonts-core"

inherit rpm
