SUMMARY = "Development headers for Boost.Locale library"
DESCRIPTION = "This package contains development headers for Boost.Locale library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_locale-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "a3360b0406b43b23e1126c2f9cce47b16f98dea56c537c1bb1a9251b520ed779aea552fe7e26231d46d48fd2fe18451d39127aae5fe0799aa360e31769206f45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_locale-devel"

RDEPENDS:${PN} += "libboost_locale1_82_0-devel"

inherit rpm
