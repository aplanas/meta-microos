SUMMARY = "Clipboard Manager"
DESCRIPTION = "Clipboard history manager for Elementary OS."
LICENSE = "GPL-2.0-only"

PV = "1.1.1"

RPM_NAME = "clipped-1.1.1-1.18.aarch64.rpm"
RPM_HASH = "0cb59189f7e874263fa1872719f72340fdd97393870f9d1c82dcfeb1ec9b8a9291830a6cec4f56033f265353051944c8bdebf93882e09972d02c56f3fa39dbda"

RPROVIDES:${PN} += "application() \
application(com.github.davidmhewitt.clipped.desktop) \
clipped \
clipped(aarch-64) \
metainfo() \
metainfo(com.github.davidmhewitt.clipped.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
