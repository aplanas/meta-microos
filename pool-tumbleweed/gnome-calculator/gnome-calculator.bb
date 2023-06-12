SUMMARY = "A GNOME Calculator Application"
DESCRIPTION = "A GNOME calculator package based on calctool and MP library."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-calculator-44.0-1.1.aarch64.rpm"
RPM_HASH = "bb45d4fadeb0122437fd697875e46d267606b50748079373c8822dca40fa50a8252b5b8d8421b3c90bf0d4a36190f590ec442dec45b3b238c83670ed7cf0f029"

RPROVIDES:${PN} += "application() \
application(org.gnome.Calculator.desktop) \
gnome-calculator \
gnome-calculator(aarch-64) \
metainfo() \
metainfo(org.gnome.Calculator.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libgtksourceview-5.so.0()(64bit) \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libsoup-3.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
