SUMMARY = "GNU Privacy Assistant"
DESCRIPTION = "Gnu Privacy Assistant (GPA) is a graphical user interface for Gnu \
Privacy Guard (GPG) for displaying keyrings, manipulating keys, \
checking signatures, and signing, decrypting, and encrypting files."
LICENSE = "GPL-3.0-only"

PV = "0.10.0"

RPM_NAME = "gpa-0.10.0-2.17.aarch64.rpm"
RPM_HASH = "de91c36a050faf44365a8ce805d54a4156cd6b12dc7f3f476e2b9941b5775ffd89cce66a2d5d8fb3361758f9f2e4070258146468edaed3eafaab0fe84afbff67"

RPROVIDES:${PN} += "gpa"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libassuan.so.0 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpg-error.so.0 \
libgpgme.so.11 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libz.so.1"

inherit rpm
