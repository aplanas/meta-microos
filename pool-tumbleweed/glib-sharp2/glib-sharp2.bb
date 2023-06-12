SUMMARY = "Mono bindings for glib"
DESCRIPTION = "This package contains Mono bindings for glib."
LICENSE = "LGPL-2.1-only"

PV = "2.12.45"

RPM_NAME = "glib-sharp2-2.12.45-3.8.aarch64.rpm"
RPM_HASH = "b46cb3073d3b8fc6f99882a1fa00c87d95fef570b5b9d336212a0c609c0f208e9a97e013c28f990f6220eca51e6bb0dc44f78b520b8b764bfcd3aa3475cbd408"

RPROVIDES:${PN} += "glib-sharp2 \
glib-sharp2(aarch-64) \
libglibsharpglue-2.so()(64bit) \
mono(glib-sharp) \
mono(policy.2.10.glib-sharp) \
mono(policy.2.4.glib-sharp) \
mono(policy.2.6.glib-sharp) \
mono(policy.2.8.glib-sharp) \
pkgconfig(glib-sharp-2.0)"
RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
mono(System) \
mono(System.Core) \
mono(mscorlib)"

inherit rpm
