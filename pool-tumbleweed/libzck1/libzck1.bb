SUMMARY = "Zchunk library"
DESCRIPTION = "zchunk is a compressed file format that splits the file into independent \
chunks.  This allows you to only download the differences when downloading a \
new version of the file, and also makes zchunk files efficient over rsync. \
zchunk files are protected with strong checksums to verify that the file you \
downloaded is in fact the file you wanted. \
 \
This package contains the zchunk library, libzck."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.3.1"

RPM_NAME = "libzck1-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "c38861607114cc40950ec02cdb43f4de3f6cdc7f7fffccf72725863b5be0ac2869f23222ed169549d6e123f7f4a69f9d8b20bd527e3a2108129bba425d0c8f9e"

RPROVIDES:${PN} += "libzck.so.1 \
libzck1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libzstd.so.1"

inherit rpm
