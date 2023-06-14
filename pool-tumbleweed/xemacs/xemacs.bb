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

RPROVIDES:${PN} += "config-xemacs \
xemacs"

RDEPENDS:${PN} += "/bin/sh \
ctags \
efont-unicode \
ifnteuro \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXau.so.6 \
libXaw3d.so.8 \
libXext.so.6 \
libXmu.so.6 \
libXpm.so.4 \
libXt.so.6 \
libasound.so.2 \
libc.so.6 \
libdb-4.8.so \
libgdbm-compat.so.4 \
libgpm.so.2 \
libjpeg.so.8 \
liblber.so.2 \
libldap.so.2 \
libm.so.6 \
libpng16.so.16 \
libtiff.so.6 \
libtinfo.so.6 \
libwnn.so.0 \
permissions \
xemacs-info \
xemacs-packages \
xorg-x11-fonts \
xorg-x11-fonts-core"

inherit rpm
