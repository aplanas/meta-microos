SUMMARY = "Development files for LibBytesize"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the LibBytesize library."
LICENSE = "LGPL-2.1-only"

PV = "2.9"

RPM_NAME = "libbytesize-devel-2.9-1.1.aarch64.rpm"
RPM_HASH = "fbe11bddd2c77b4954ee3cffa57236303af2108a26aa603fd589616d9ef1229b7612f47f23132ab32eb805a4c6ca043c17b4d576f5f8b879b0d000388e4ccf08"

RPROVIDES:${PN} += "libbytesize-devel \
pkgconfig-bytesize"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbytesize1"

inherit rpm
