SUMMARY = "Headers for building against zchunk"
DESCRIPTION = "zchunk is a compressed file format that splits the file into independent \
chunks.  This allows you to only download the differences when downloading a \
new version of the file, and also makes zchunk files efficient over rsync. \
zchunk files are protected with strong checksums to verify that the file you \
downloaded is in fact the file you wanted. \
 \
This package contains the headers necessary for building against the zchunk \
library, libzck."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.3.1"

RPM_NAME = "libzck-devel-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "50a6541eca76827196cb602430c58aa5b812869416d8f7f971bde68768c52394d7edc8f6ce1bb8c478b82bfd0c84fe6c6c9de6b4a8f1657fc1e725def7110d94"

RPROVIDES:${PN} += "libzck-devel \
pkgconfig-zck \
zchunk-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzck1 \
pkgconfig-libzstd \
pkgconfig-openssl"

inherit rpm
