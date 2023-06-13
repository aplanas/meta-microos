SUMMARY = "Common files used by font-manager"
DESCRIPTION = "This package contains common files such as libraries. \
 These files are required by font-manager and font-viewer."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.8"

RPM_NAME = "font-manager-common-0.8.8-2.3.aarch64.rpm"
RPM_HASH = "8b061601d969942f4f39b91d4cc40bd22257f958c5f8683a91a81dedc31ec9f40971e31415f3f49ae2c09617486cf295cf18aad983004ba814ba1b471ccbe2f6"

RPROVIDES:${PN} += "font-manager-common \
font-manager-common(aarch-64) \
libfontmanager.so.0()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangoft2-1.0.so.0()(64bit) \
libsqlite3.so.0()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
