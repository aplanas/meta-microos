SUMMARY = "The lunar-calendar libraries"
DESCRIPTION = "This package contains the libraries for lunar-calendar."
LICENSE = "GPL-2.0+"

PV = "3.0.0+git20191124.f91a880"

RPM_NAME = "liblunar-calendar-3_0-1-3.0.0+git20191124.f91a880-1.15.aarch64.rpm"
RPM_HASH = "fc6c54f02f5e64cad694221c45ea76eecd13401fa67dabcda549beeb5c0a7d31e7b1718834a35ee095e75c990bb835023c6c888c41fbe265aa860d1accc6fcc6"

RPROVIDES:${PN} += "liblunar-calendar-3-0-1 \
liblunar-calendar-3.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
liblunar-date-3.0.so.1 \
libpango-1.0.so.0"

inherit rpm
