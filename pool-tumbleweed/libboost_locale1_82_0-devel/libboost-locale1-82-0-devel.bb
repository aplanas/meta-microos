SUMMARY = "Development headers for Boost.Locale library"
DESCRIPTION = "This package contains development headers for Boost.Locale library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_locale1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "3fc2e512ac64c7479e62dd057f11685ae6c4157b7fc0c9fdf7e73b593ffdc72edb5629aefde18b171594b46b92eb6121109146ee2d224d4bc52defd0cb0eb74d"

RPROVIDES:${PN} += "libboost_locale-devel-impl \
libboost_locale1_82_0-devel \
libboost_locale1_82_0-devel(aarch-64)"

RDEPENDS:${PN} += "libboost_chrono1_82_0-devel \
libboost_headers1_82_0-devel \
libboost_locale1_82_0 \
libboost_system1_82_0-devel \
libboost_thread1_82_0-devel \
libicu-devel"

inherit rpm
