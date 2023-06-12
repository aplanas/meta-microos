SUMMARY = "MATE dictionary"
DESCRIPTION = "This is the MATE dictionary as shipped with the MATE utilities. \
mate-dictionary is a program which can look up the definition of \
words"
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-dictionary-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "4dbd695e81e9e38c069afe0d2fb3bcdc0eb8ab3b1b82e892f11c8a3f49cf4d3ec8fdce135533c2a0fbc0d3b23eaa38951dacb15df4435cdbd8bc47e66dc54f84"

RPROVIDES:${PN} += "application() \
application(mate-dictionary.desktop) \
mate-dictionary \
mate-dictionary(aarch-64) \
metainfo() \
metainfo(mate-dictionary.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libmate-panel-applet-4.so.1()(64bit) \
libmatedict.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
mate-desktop-gschemas"

inherit rpm
