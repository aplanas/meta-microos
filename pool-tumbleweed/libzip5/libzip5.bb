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

RPROVIDES:${PN} += "libzip.so.5 \
libzip5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgnutls.so.30 \
liblzma.so.5 \
libnettle.so.8 \
libz.so.1 \
libzstd.so.1"

inherit rpm
