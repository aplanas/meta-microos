SUMMARY = "Development files for libxcfun"
DESCRIPTION = "The xcfun-devel package contains libraries and header files for \
developing applications that use libxcfun."
LICENSE = "MPL-2.0"

PV = "2.1.1"

RPM_NAME = "xcfun-devel-2.1.1-1.11.aarch64.rpm"
RPM_HASH = "8e2af78d5aef1d701cb79ac84f29bbb3fd5cb04f56c95c43c9fc5b8f0ffc4c867425f2c89e6d34bb2617afb0636c7050bc74d79ceb6339dc1de3d0af7a14d019"

RPROVIDES:${PN} += "cmake-XCFun \
xcfun-devel"

RDEPENDS:${PN} += "libxcfun2"

inherit rpm
