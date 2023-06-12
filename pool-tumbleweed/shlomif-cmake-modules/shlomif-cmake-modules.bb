SUMMARY = "Shlomi Fish's CMake Modules"
DESCRIPTION = "Shlomi Fish's CMake Modules"
LICENSE = "MIT"

PV = "8f5acb6450c1"

RPM_NAME = "shlomif-cmake-modules-8f5acb6450c1-1.10.noarch.rpm"
RPM_HASH = "52aa2cf6f81720b27391de7993602910d0b0b96d23260d201246aea54a27cb6858beb26a493abc1000a3657016d1c6e6345bf359c98910193c3d9e60d8635c93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shlomif-cmake-modules"
RDEPENDS:${PN} += "cmake \
perl"

inherit rpm
