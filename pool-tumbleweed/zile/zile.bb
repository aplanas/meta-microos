SUMMARY = "Lightweight Emacs Clone"
DESCRIPTION = "Zile is another Emacs-clone.  Zile is a customizable, self-documenting \
real-time, open-source display editor.  Zile was written to be as similar \
as possible to Emacs; every Emacs user should feel at home with Zile."
LICENSE = "GPL-3.0-only"

PV = "2.6.2"

RPM_NAME = "zile-2.6.2-1.10.aarch64.rpm"
RPM_HASH = "847f2c3b93b3d0c0ffee37abee9280e37a431def041e45159a298b668df75ed3a3202586958938c380332612e80cb575c39b18d7353d7162f148b79adc5f9e1e"

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
