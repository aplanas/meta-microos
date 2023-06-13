SUMMARY = "Development headers for Boost.URL library"
DESCRIPTION = "This package contains development headers for Boost.URL library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_url1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "db66da0d8562a64fc8e0446e32fd214b26e314003ae3b531d2537f518367a167e807e8c1b8903ae40a53fcb236a0217afc82ad21e9ce75a70c4f60132666ba36"

RPROVIDES:${PN} += "libboost_url-devel-impl \
libboost_url1_82_0-devel \
libboost_url1_82_0-devel(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
