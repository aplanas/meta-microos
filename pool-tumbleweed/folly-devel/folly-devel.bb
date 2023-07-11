SUMMARY = "Development files for folly, a utility library"
DESCRIPTION = "Development files library for folly, a C++ utility library."
LICENSE = "MIT"

PV = "2023.05.01.00"

RPM_NAME = "folly-devel-2023.05.01.00-1.2.aarch64.rpm"
RPM_HASH = "a758b15ab6a88befe1bb149417aabdf4ab6f13b03f50ab94750d7b3038312f71804fd371a6a08a8d8988131a187fdc76009540179684c4c30e4e13f53e9e41fb"

RPROVIDES:${PN} += "cmake-folly \
folly-devel \
pkgconfig-libfolly"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfolly-v2023-05-01-00"

inherit rpm
