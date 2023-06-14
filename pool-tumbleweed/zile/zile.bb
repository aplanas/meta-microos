SUMMARY = "Lightweight Emacs Clone"
DESCRIPTION = "Zile is another Emacs-clone.  Zile is a customizable, self-documenting \
real-time, open-source display editor.  Zile was written to be as similar \
as possible to Emacs; every Emacs user should feel at home with Zile."
LICENSE = "GPL-3.0-only"

PV = "2.6.2"

RPM_NAME = "zile-2.6.2-1.9.aarch64.rpm"
RPM_HASH = "03af9cd6dbe578af179979f178470f6230531159dface40b87595a1ddb3c7ddfa699889634a0cfbb11aa4f91dcb364e617be2cda078f2a0f0942fdd7e4a49d28"

RPROVIDES:${PN} += "zile \
zile-base \
zile-desktop \
zile-doc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
