SUMMARY = "TN3270 access library"
DESCRIPTION = "Originally designed as part of the pw3270 application, this library \
provides a TN3270 virtual terminal widget for GTK 3. \
 \
For more details, see https://softwarepublico.gov.br/social/pw3270/ ."
LICENSE = "LGPL-3.0-only"

PV = "5.4"

RPM_NAME = "libv3270-5_4-5.4-1.9.aarch64.rpm"
RPM_HASH = "622365af17d394cbab16d8f67eae56f88a95f75b7efed80b9a3ac970e21730c670c33adbddb7f417391560ace6fdc39f204f49d3d433d1816e106c4a19d0e499"

RPROVIDES:${PN} += "libv3270-5_4 \
libv3270-5_4(aarch-64) \
libv3270.so.5.4()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
lib3270.so.5.4()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
