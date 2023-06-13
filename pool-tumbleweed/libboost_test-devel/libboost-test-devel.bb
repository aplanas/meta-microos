SUMMARY = "Development headers for Boost.Test library"
DESCRIPTION = "Development headers for Boost.Test library. Boost.Test supports for \
simple program testing, full unit testing, and for program execution \
monitoring. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_test-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "a1520477a4e8a259a1c03a7eddb1aaec3747573f419ee5a235f94d07f4d4bcadc96520005574e7b8052dace23d0a4bef0b33c85f3ea3540186485d689d5c2ff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_test-devel"

RDEPENDS:${PN} += "libboost_test1_82_0-devel"

inherit rpm
