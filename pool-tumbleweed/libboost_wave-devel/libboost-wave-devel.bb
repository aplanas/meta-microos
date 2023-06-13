SUMMARY = "Development headers for Boost.Wave library"
DESCRIPTION = "This package contains development headers for Boost.Wave library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_wave-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "2649f29f0da0e961f94acc7a1e0f322e1b92d4f472303796a6e9ac24750de8988d93033746d049586884aa29c1a34bfcdec98a0d6295efedd55178f7d336cbab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_wave-devel"

RDEPENDS:${PN} += "libboost_wave1_82_0-devel"

inherit rpm
