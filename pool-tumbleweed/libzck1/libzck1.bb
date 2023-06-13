SUMMARY = "Zchunk library"
DESCRIPTION = "zchunk is a compressed file format that splits the file into independent \
chunks.  This allows you to only download the differences when downloading a \
new version of the file, and also makes zchunk files efficient over rsync. \
zchunk files are protected with strong checksums to verify that the file you \
downloaded is in fact the file you wanted. \
 \
This package contains the zchunk library, libzck."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.3.0"

RPM_NAME = "libzck1-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "4b0b068a3eef7d0a884e6fc8f8cae8aa0297816c1b04d707df2386c99674a4d9abfaf4768a91b58f818d05659b4ccf92fe7a03b9fc5e98aec9337dac91f41cd0"

RPROVIDES:${PN} += "libzck.so.1()(64bit) \
libzck1 \
libzck1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
