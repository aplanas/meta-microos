SUMMARY = "Lightweight Emacs Clone"
DESCRIPTION = "Zile is another Emacs-clone.  Zile is a customizable, self-documenting \
real-time, open-source display editor.  Zile was written to be as similar \
as possible to Emacs; every Emacs user should feel at home with Zile."
LICENSE = "GPL-3.0-only"

PV = "2.6.2"

RPM_NAME = "zile-2.6.2-1.9.aarch64.rpm"
RPM_HASH = "03af9cd6dbe578af179979f178470f6230531159dface40b87595a1ddb3c7ddfa699889634a0cfbb11aa4f91dcb364e617be2cda078f2a0f0942fdd7e4a49d28"

RPROVIDES:${PN} += "application() \
application(zile.desktop) \
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
zile \
zile(aarch-64) \
zile-base \
zile-desktop \
zile-doc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libncursesw.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
