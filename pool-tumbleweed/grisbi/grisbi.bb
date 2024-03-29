SUMMARY = "Personal Accounting Application"
DESCRIPTION = "Grisbi is a personal accounting application, aiming at providing the most \
simple and intuitive software for basic use, although it can be very powerful \
if you spend a little time on the setup. \
 \
One notable feature is that it respects French accounting rules."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.5"

RPM_NAME = "grisbi-2.0.5-1.9.aarch64.rpm"
RPM_HASH = "12a1e5eda99b39103fa6f00b02289fe1d22ed22d9634016738fed06e774f10dd1016249fc29b5cbb59f251989170256badae8a9521a6721600fa3f332f3bbec1"

RPROVIDES:${PN} += "grisbi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcrypto.so.3 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgoffice-0.10.so.10 \
libgtk-3.so.0 \
libm.so.6 \
libofx.so.7 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxml2.so.2 \
libz.so.1"

inherit rpm
