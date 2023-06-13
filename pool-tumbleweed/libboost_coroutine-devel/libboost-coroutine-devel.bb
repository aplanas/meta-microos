SUMMARY = "Development headers for Boost.Coroutine"
DESCRIPTION = "This package provides headers for Boost.Coroutine libraries. \
Boost.Coroutine2 provides templates for generalized subroutines which \
allow suspending and resuming execution at certain locations. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_coroutine-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "d473bcac333b884c06e2d0b0c871071a6fe9bae0984013fb95e2cd6e659beba741f85e460c83928a1cd4e47d5a6110aa7c4c1c016711a13508d1bb66a31cf9f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_coroutine-devel"

RDEPENDS:${PN} += "libboost_coroutine1_82_0-devel"

inherit rpm
