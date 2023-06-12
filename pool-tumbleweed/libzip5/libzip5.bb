SUMMARY = "C library for reading, creating, and modifying zip archives"
DESCRIPTION = "This is libzip, a C library for reading, creating, and modifying zip \
archives.  Files can be added from data buffers, files, or compressed \
data copied directly from other zip archives.  Changes made without \
closing the archive can be reverted.  The API is documented by man \
pages."
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "libzip5-1.9.2-1.5.aarch64.rpm"
RPM_HASH = "3a5683983d163856af53f7e1b0c10ec009fb9a99deddb4c7fe2700743be06af497e1573f06e4fd26f61c006adcb09763dce116ee3f7e4b5eddf2dd450b60ec16"

RPROVIDES:${PN} += "libzip.so.5()(64bit) \
libzip5 \
libzip5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
libnettle.so.8()(64bit) \
libnettle.so.8(NETTLE_8)(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
