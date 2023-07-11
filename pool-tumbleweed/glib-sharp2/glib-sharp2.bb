SUMMARY = "Mono bindings for glib"
DESCRIPTION = "This package contains Mono bindings for glib."
LICENSE = "LGPL-2.1-only"

PV = "2.12.45"

RPM_NAME = "glib-sharp2-2.12.45-3.9.aarch64.rpm"
RPM_HASH = "c820ff9ce4fe0b5b859f1abbd078ef0340487cb21ba9b3d3283046f6b8100074d6deba5aeb16384ce034ed4c2c566965f753821b6216fc6b9e37674891fa2cb8"

RPROVIDES:${PN} += "glib-sharp2 \
libglibsharpglue-2.so \
mono-glib-sharp \
mono-policy.2.10.glib-sharp \
mono-policy.2.4.glib-sharp \
mono-policy.2.6.glib-sharp \
mono-policy.2.8.glib-sharp \
pkgconfig-glib-sharp-2.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
mono-System \
mono-System.Core \
mono-mscorlib"

inherit rpm
