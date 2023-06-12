SUMMARY = "Trivial dock"
DESCRIPTION = "Plank is a trivial dock. \
 \
It is a library which can be extended to create other \
dock programs with more advanced features."
LICENSE = "GPL-3.0-or-later"

PV = "0.11.89"

RPM_NAME = "plank-0.11.89-2.4.aarch64.rpm"
RPM_HASH = "2aa08e44c256302e40d77286391fafd67ecfb526992c503c908cb38e50142382b6863ccbf1b799b29946c216c7ea6b4e48496c96b3ea7769073b276ce0d548b2"

RPROVIDES:${PN} += "application() \
application(plank.desktop) \
metainfo() \
metainfo(plank.appdata.xml) \
plank \
plank(aarch-64)"
RDEPENDS:${PN} += "bamf-daemon \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libplank.so.1()(64bit)"

inherit rpm
