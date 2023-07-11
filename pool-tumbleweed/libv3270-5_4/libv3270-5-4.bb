SUMMARY = "TN3270 access library"
DESCRIPTION = "Originally designed as part of the pw3270 application, this library \
provides a TN3270 virtual terminal widget for GTK 3. \
 \
For more details, see https://softwarepublico.gov.br/social/pw3270/ ."
LICENSE = "LGPL-3.0-only"

PV = "5.4"

RPM_NAME = "libv3270-5_4-5.4-1.10.aarch64.rpm"
RPM_HASH = "2a27c118c4d614439ab09fe46929740637343bedc0abab7c6003bea743f6f1e554badce9d864c122eaeab4d004e53dee47499a3d91753fe00e6b6fe98e3ddecd"

RPROVIDES:${PN} += "libv3270-5-4 \
libv3270.so.5.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
lib3270.so.5.4 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
