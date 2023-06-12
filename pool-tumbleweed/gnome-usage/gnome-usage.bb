SUMMARY = "System resources viewer for GNOME"
DESCRIPTION = "GNOME Usage is a program to view information about the use of system \
resources, like memory and disk space."
LICENSE = "GPL-3.0-only"

PV = "3.38.1"

RPM_NAME = "gnome-usage-3.38.1-1.10.aarch64.rpm"
RPM_HASH = "b2b707a5d1b60930812f2e473252b79a02b4a5e64aecc1faab1e6de94e3e34a04dee587eab9321a8a335394bd8a937771bdcdb542cf96045d645ae352392528e"

RPROVIDES:${PN} += "application() \
application(org.gnome.Usage.desktop) \
gnome-usage \
gnome-usage(aarch-64) \
metainfo() \
metainfo(org.gnome.Usage.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libdazzle-1.0.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtop-2.0.so.11()(64bit) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit) \
libpango-1.0.so.0()(64bit) \
libtracker-sparql-3.0.so.0()(64bit)"

inherit rpm
