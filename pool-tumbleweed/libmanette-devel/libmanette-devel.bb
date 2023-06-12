SUMMARY = "Development files for the libmanette library"
DESCRIPTION = "libmanette allows easy access to game controllers."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.6"

RPM_NAME = "libmanette-devel-0.2.6-2.10.aarch64.rpm"
RPM_HASH = "6e6b9617fa034c0805dcc3ece93b23c41953ddcae8e7b90da20393de17df6dfde577e390c1e54916921b0eae82230ebbcb24f683f51eaf47b76030c8de68adab"

RPROVIDES:${PN} += "libmanette-devel \
libmanette-devel(aarch-64) \
pkgconfig(manette-0.2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libmanette-0.2.so.0()(64bit) \
libmanette-0_2-0 \
pkgconfig(glib-2.0)"

inherit rpm
