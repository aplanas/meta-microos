SUMMARY = "Color palette viewer"
DESCRIPTION = "A program for viewing and copying colors from Elementary OS."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.0"

RPM_NAME = "palette-4.0.0-1.10.aarch64.rpm"
RPM_HASH = "8ad324afa27c5bdff999e50f7553ffaac93a86c2fe39cf619901e748ebffb353adcf1f7caec6f21ee47877fc8365506c01c39c22f85216f2068313e9b7849de1"

RPROVIDES:${PN} += "application() \
application(com.github.cassidyjames.palette.desktop) \
metainfo() \
metainfo(com.github.cassidyjames.palette.appdata.xml) \
palette \
palette(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit)"

inherit rpm
