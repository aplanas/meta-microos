SUMMARY = "Library for repodata manipulation"
DESCRIPTION = "Libraries for applications using the createrepo_c library \
for easy manipulation with a repodata."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.1"

RPM_NAME = "libcreaterepo_c0-0.20.1-3.2.aarch64.rpm"
RPM_HASH = "8343f2b06d43ddf6500b9813417302af2a5f7fb9c777c6d0c89fe9c652b87312b3242214d2ea78967f37d11c4c31c2f0f302029e8eb72a1b1332560a8207e064"

RPROVIDES:${PN} += "libcreaterepo-c.so.0 \
libcreaterepo-c0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblzma.so.5 \
libmagic.so.1 \
libmodulemd.so.2 \
librpm.so.9 \
librpmio.so.9 \
libsqlite3.so.0 \
libxml2.so.2 \
libz.so.1 \
libzck.so.1"

inherit rpm
