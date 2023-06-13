SUMMARY = "Simple text viewer"
DESCRIPTION = "Basic utility that just displays plain text files."
LICENSE = "GPL-3.0+"

PV = "0.1.4"

RPM_NAME = "clack-0.1.4-1.28.aarch64.rpm"
RPM_HASH = "44f3319cc102ce0f6befb9693e726dbba8b3f509dda63dad837d1bd7de68ccd3e1fbaadcaa9a16f041e57fb1e1330c848d94165cf419049785b24ddd74be7a83"

RPROVIDES:${PN} += "application() \
application(com.github.cassidyjames.clack.desktop) \
clack \
clack(aarch-64) \
metainfo() \
metainfo(com.github.cassidyjames.clack.appdata.xml)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtksourceview-3.0.so.1()(64bit)"

inherit rpm
