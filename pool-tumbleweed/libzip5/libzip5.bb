SUMMARY = "C library for reading, creating, and modifying zip archives"
DESCRIPTION = "This is libzip, a C library for reading, creating, and modifying zip \
archives.  Files can be added from data buffers, files, or compressed \
data copied directly from other zip archives.  Changes made without \
closing the archive can be reverted.  The API is documented by man \
pages."
LICENSE = "BSD-3-Clause"

PV = "1.10.0"

RPM_NAME = "libzip5-1.10.0-1.1.aarch64.rpm"
RPM_HASH = "be29fbd77a9359ae3f4e359c2b9bdbda16b25e6672d5fa617afcb71b964d969220f72ac18db4ef6804107e69026f1e1ad12190c4787afdfd235b004a910e470d"

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
