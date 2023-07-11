SUMMARY = "Mono bindings for glade"
DESCRIPTION = "This package contains Mono bindings for glade."
LICENSE = "LGPL-2.1-only"

PV = "2.12.45"

RPM_NAME = "glade-sharp2-2.12.45-3.9.aarch64.rpm"
RPM_HASH = "272385a135113a40329b6bfb13fff9e15e6b6dac5a97b1bda6d048145ed92083e23908408e169d638ab4d44d577cda9c550031ef757bf5c8a5b3750c056be551"

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
