SUMMARY = "Development libraries for libblosc2-2"
DESCRIPTION = "This package provides development libraries and headers \
for libblosc2-2."
LICENSE = "MIT & BSD-3-Clause & BSD-2-Clause"

PV = "2.7.1"

RPM_NAME = "blosc2-devel-2.7.1-2.3.aarch64.rpm"
RPM_HASH = "81fa860a7d9be13aa3a60d7180c215e337c001b9d58a48b519b58f546d362e9ebfd711deb66e30addc938c74c308292a403471cdb6c47676e9f3da643e3bfbdc"

RPROVIDES:${PN} += "blosc2-devel blosc2-devel(aarch-64) pkgconfig(blosc2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libblosc2-2"

inherit rpm
