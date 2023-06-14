SUMMARY = "Development headers for Boost.Serialization library"
DESCRIPTION = "This package contains development headers for Boost.Serialization \
library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_serialization-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "120c932b47d0235a5f677085841d235a9d43c8e683eac73ce1eb73818953381e8e5337a37f7fd5b9fc6b474dd6316f965cd40b49f5e6b4c4fadb770bd7f4def2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost-serialization-devel"

RDEPENDS:${PN} += "libboost-serialization1-82-0-devel"

inherit rpm
