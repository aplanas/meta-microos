SUMMARY = "Library for repodata manipulation"
DESCRIPTION = "Libraries for applications using the createrepo_c library \
for easy manipulation with a repodata."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.1"

RPM_NAME = "libcreaterepo_c0-0.20.1-3.1.aarch64.rpm"
RPM_HASH = "4bbe0b476a2b0c1e2eca4dc14d67053de45ce1caa65e26947dd7c7c5e6d9540edf04475dfe2dd077637545ab76661ffdd826f4b95490bf700d90778633fc0e61"

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
