SUMMARY = "IDE for The Coq Proof Assistant"
DESCRIPTION = "The Coq Integrated Development Interface is a graphical interface for the Coq proof assistant."
LICENSE = "LGPL-2.1-only"

PV = "8.17.0"

RPM_NAME = "coq-ide-8.17.0-1.1.aarch64.rpm"
RPM_HASH = "f19c40f2ca63c98141d707dcf03413c375dfa9eb455e07ee83e9d1bf91d38875b469570c0ad561cf14c7209a87e77e384f1f50b45b43cbc55242ed8b1af9f3ce"

RPROVIDES:${PN} += "application() \
application(fr.inria.coq.coqide.desktop) \
coq-ide \
coq-ide(aarch-64) \
metainfo() \
metainfo(fr.inria.coq.coqide.metainfo.xml) \
mimehandler(text/x-coqsrc)"
RDEPENDS:${PN} += "/usr/bin/ocamlrun \
coq \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmp.so.10()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtksourceview-3.0.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
