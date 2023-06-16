SUMMARY = "GNU Privacy Assistant"
DESCRIPTION = "Gnu Privacy Assistant (GPA) is a graphical user interface for Gnu \
Privacy Guard (GPG) for displaying keyrings, manipulating keys, \
checking signatures, and signing, decrypting, and encrypting files."
LICENSE = "GPL-3.0-only"

PV = "0.10.0"

RPM_NAME = "gpa-0.10.0-2.16.aarch64.rpm"
RPM_HASH = "d9a8ded7f4bd6c554f362f5af8b90fedbb49023e1aeeb5f3febf504a93d2f4e1d784ee04f7d793f37a9cabe8212562ba6b856bcb365deb7fbe81717a7259c73b"

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
