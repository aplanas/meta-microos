SUMMARY = "cmake support for the cmocka library"
DESCRIPTION = "cmake support for developing with the cmocka unit testing library."
LICENSE = "Apache-2.0"

PV = "1.1.7"

RPM_NAME = "libcmocka-cmake-1.1.7-3.1.aarch64.rpm"
RPM_HASH = "5cb8d20e9257dbc2125e756cbeca364e6259e25dc62403df5d84a397473d8f7f11c705ceabe8b20990f7dd7d2d0e8c2a61631eec476baf5d7b1e418df9942f0f"

RPROVIDES:${PN} += "cmake-cmocka \
libcmocka-cmake \
libcmocka-devel-/usr/lib64/cmake/cmocka"

RDEPENDS:${PN} += "cmake \
libcmocka-devel"

inherit rpm
