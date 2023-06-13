SUMMARY = "Development headers for Boost.TypeErasure library"
DESCRIPTION = "This package contains development headers for Boost.TypeErasure library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_type_erasure-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "384ea4c8d8d51f5e370582477cd4a6ca26a192957baeacea07b279707d76c737a0df2236f1d00ac5e987483171f742e19e4e7675fef97948eef3c9674b058818"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_type_erasure-devel"

RDEPENDS:${PN} += "libboost_type_erasure1_82_0-devel"

inherit rpm
