SUMMARY = "Library for Crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "libgcr-3-1-3.41.0-3.3.aarch64.rpm"
RPM_HASH = "888b71286c9cc80690994c35f0aad73111303aac6f4ddbac39ffca636440d0917a884fc4132005d9cb7042307918619fafe13d72055f6ca5cdec02c860ba4555"

RPROVIDES:${PN} += "gcr3 \
libgcr-3-1 \
libgcr-3-1(aarch-64) \
libgcr-base-3.so.1()(64bit) \
libgcr-ui-3.so.1()(64bit)"

RDEPENDS:${PN} += "(gcr3-ssh-askpass if gnome-keyring) \
/sbin/ldconfig \
gcr-data \
gcr-prompter \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
libcairo.so.2()(64bit) \
libgck-1.so.0()(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libp11-kit.so.0()(64bit) \
libp11-kit.so.0(LIBP11_KIT_1.0)(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
