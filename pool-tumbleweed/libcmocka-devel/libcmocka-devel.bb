SUMMARY = "Development headers for the cmocka library"
DESCRIPTION = "Development headers for the cmocka unit testing library."
LICENSE = "Apache-2.0"

PV = "1.1.7"

RPM_NAME = "libcmocka-devel-1.1.7-2.1.aarch64.rpm"
RPM_HASH = "7b62eb68b81f1fd1f944274cff80035414ed7c5fbaad246e7595e44851ed33e819fb4b5a93e6db868e16ca13e38aabf9a4408e5eafb924407e303f95e8b4e1cd"

RPROVIDES:${PN} += "cmake(cmocka) \
libcmocka-devel \
libcmocka-devel(aarch-64) \
pkgconfig(cmocka)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
libcmocka0 \
pkg-config"

inherit rpm
