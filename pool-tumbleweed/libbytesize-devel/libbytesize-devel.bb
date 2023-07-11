SUMMARY = "Development files for LibBytesize"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the LibBytesize library."
LICENSE = "LGPL-2.1-only"

PV = "2.8"

RPM_NAME = "libbytesize-devel-2.8-1.2.aarch64.rpm"
RPM_HASH = "c91b0cf88eb194f8011759c66fa5c330c3c913dc1de2e72b262554cdf7ef132f00bab78f5903936d7ebbe3c0756c4b7b452760f9eee63f74c0f99544f9704a29"

RPROVIDES:${PN} += "libbytesize-devel \
pkgconfig-bytesize"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbytesize1"

inherit rpm
