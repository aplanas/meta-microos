SUMMARY = "A GTK application for photographers using GNU Linux or especially Linux phones"
DESCRIPTION = "A GTK application for photographers using GNU Linux or especially \
Linux phones. It can be used to calculate the position of the Sun, \
Moon and Milky Way in order to plan the position and time for an \
photograph."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "picplanner-0.4.0-1.1.aarch64.rpm"
RPM_HASH = "6045b6cf743b353dc19e905b72416bde0506bf6318324320b2c76b873d82173cde4125afdb42bc20b9b92e77c48ca2a002fa231b7d6d800cb376f7dec35f6b56"

RPROVIDES:${PN} += "application() \
application(de.zwarf.picplanner.desktop) \
metainfo() \
metainfo(de.zwarf.picplanner.metainfo.xml) \
picplanner \
picplanner(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgeoclue-2.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libgweather-4.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libshumate-1.0.so.1()(64bit)"

inherit rpm
