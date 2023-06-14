SUMMARY = "Mono bindings for glade"
DESCRIPTION = "This package contains Mono bindings for glade."
LICENSE = "LGPL-2.1-only"

PV = "2.12.45"

RPM_NAME = "glade-sharp2-2.12.45-3.8.aarch64.rpm"
RPM_HASH = "e05db66fe806224ddc473e85968ccd2ffd49e6f6f06c7714097c9dc67639e204292a6a4494ffb705fb11fd3fbebf1e361a45e6d93c618c4a09bf12c3118fd05d"

RPROVIDES:${PN} += "glade-sharp2 \
libgladesharpglue-2.so \
mono-glade-sharp \
mono-policy.2.10.glade-sharp \
mono-policy.2.4.glade-sharp \
mono-policy.2.6.glade-sharp \
mono-policy.2.8.glade-sharp \
pkgconfig-glade-sharp-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglade-2-0-0 \
mono-gdk-sharp \
mono-glib-sharp \
mono-gtk-sharp \
mono-mscorlib \
pkgconfig-gtk-sharp-2.0"

inherit rpm
