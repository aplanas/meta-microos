SUMMARY = "GNU Privacy Assistant"
DESCRIPTION = "Gnu Privacy Assistant (GPA) is a graphical user interface for Gnu \
Privacy Guard (GPG) for displaying keyrings, manipulating keys, \
checking signatures, and signing, decrypting, and encrypting files."
LICENSE = "GPL-3.0-only"

PV = "0.10.0"

RPM_NAME = "gpa-0.10.0-2.16.aarch64.rpm"
RPM_HASH = "d9a8ded7f4bd6c554f362f5af8b90fedbb49023e1aeeb5f3febf504a93d2f4e1d784ee04f7d793f37a9cabe8212562ba6b856bcb365deb7fbe81717a7259c73b"

RPROVIDES:${PN} += "application() \
application(gpa.desktop) \
gpa \
gpa(aarch-64) \
mimehandler(application/pgp-encrypted) \
mimehandler(application/pgp-signature)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libassuan.so.0()(64bit) \
libassuan.so.0(LIBASSUAN_1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpg-error.so.0()(64bit) \
libgpg-error.so.0(GPG_ERROR_1.0)(64bit) \
libgpgme.so.11()(64bit) \
libgpgme.so.11(GPGME_1.0)(64bit) \
libgpgme.so.11(GPGME_1.1)(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libz.so.1()(64bit)"

inherit rpm
