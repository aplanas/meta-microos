SUMMARY = "Utility to list the resource database of an X application"
DESCRIPTION = "The appres program prints the resources seen by an application (or \
subhierarchy of an application) with the specified class and instance \
names. It can be used to determine which resources a particular \
program will load."
LICENSE = "X11"

PV = "1.0.6"

RPM_NAME = "appres-1.0.6-1.6.aarch64.rpm"
RPM_HASH = "e910dcd454b1152973bcbaffa76747445346a5747edfce9d8105045d74bb74c6afc1e09b72eccbd4daf47e345606ebb006e5d5140f85b29f87e624bda5ba5a47"

RPROVIDES:${PN} += "appres \
appres(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
