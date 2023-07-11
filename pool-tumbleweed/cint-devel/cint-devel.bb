SUMMARY = "Development files for libcint"
DESCRIPTION = "The libcint-devel package contains libraries and header files for \
developing applications that use libcint."
LICENSE = "BSD-2-Clause"

PV = "4.4.1"

RPM_NAME = "cint-devel-4.4.1-1.10.aarch64.rpm"
RPM_HASH = "d0bb41153033f67d440cfb4f992a88a9a665576f3a350b3e1391cb426da231bee9be2f30e208c1e9b64e7e7e887401cceaa1875fa17801c4227fae2c2beddad8"

RPROVIDES:${PN} += "cint-devel"

RDEPENDS:${PN} += "libcint4"

inherit rpm
