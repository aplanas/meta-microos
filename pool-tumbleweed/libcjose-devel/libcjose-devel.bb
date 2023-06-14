SUMMARY = "C library implementing the Javascript Object Signing and Encryption (JOSE)"
DESCRIPTION = "C library implementing the Javascript Object Signing and Encryption (JOSE)"
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "libcjose-devel-0.6.1-4.2.aarch64.rpm"
RPM_HASH = "90545f832ca9668454422e638f54ee7e010f67f00e68a50c9a74983542ea12a0b7b2cd4f36cba4206d94b5efbbaceddb9ad208727fda286cfbbb2359f5c08f98"

RPROVIDES:${PN} += "libcjose-devel \
pkgconfig-cjose"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcjose0 \
pkgconfig-jansson \
pkgconfig-libcrypto"

inherit rpm
