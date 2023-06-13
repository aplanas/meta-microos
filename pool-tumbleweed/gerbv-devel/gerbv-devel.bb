SUMMARY = "Gerber File Viewer that supports the RS-274X Standard"
DESCRIPTION = "This package contains development files for developing applications \
that use gerbv library."
LICENSE = "GPL-2.0-only"

PV = "2.9.6"

RPM_NAME = "gerbv-devel-2.9.6-1.3.aarch64.rpm"
RPM_HASH = "1af8d2e9a262d92b58454483d08fbdf425771dd5bf8c11c2e32e25c6d28d02ed61d2fd512ec3af20b14c8f0fc145da26dca339e8a7b7b028691dba43969b24da"

RPROVIDES:${PN} += "gerbv-devel \
gerbv-devel(aarch-64) \
pkgconfig(libgerbv)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gtk2-devel \
libgerbv1 \
libpng-devel \
pkgconfig(glib-2.0) \
pkgconfig(gtk+-2.0)"

inherit rpm
