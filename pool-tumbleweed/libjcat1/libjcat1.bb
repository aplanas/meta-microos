SUMMARY = "Library for reading and writing gzip-compressed JSON catalog files"
DESCRIPTION = "This library allows reading and writing gzip-compressed JSON \
catalog files, which can be used to store GPG, PKCS-7 and \
SHA-256 checksums for each file. This provides  equivalent \
functionality to the catalog files supported in Microsoft Windows."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.14"

RPM_NAME = "libjcat1-0.1.14-1.1.aarch64.rpm"
RPM_HASH = "fc7decfe28c962750dfc736381c6d50727483868ef33ae5761f823100e6b5573ef3cd53cf10150591de0d224b95158228c8b12628dae282e2fef4b0f654470d2"

RPROVIDES:${PN} += "libjcat.so.1 \
libjcat1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgpg-error.so.0 \
libgpgme.so.11 \
libhogweed.so.6 \
libjson-glib-1.0.so.0"

inherit rpm
