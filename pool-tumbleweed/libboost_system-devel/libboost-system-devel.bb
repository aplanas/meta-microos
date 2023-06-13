SUMMARY = "Development headers for Boost.System library"
DESCRIPTION = "This package contains development headers for Boost.System library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_system-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "abff4d2ec5c9e0249e1c8d63d715f8492e70a4133d2a6ef34cbfcb32ec88ca620f6e6750632ad412040d8b4ca5289bab25e726affd71e6bf1ebe9eceb7cccf33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_system-devel"

RDEPENDS:${PN} += "libboost_system1_82_0-devel"

inherit rpm
