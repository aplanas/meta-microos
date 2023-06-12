SUMMARY = "Development headers for Boost.Log library"
DESCRIPTION = "Development headers for Boost.Log library which aims to make logging \
significantly easier for the application developer. It provides a wide \
range of out-of-the-box tools along with public interfaces for extending \
the library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_log1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "21cac94b8125ca7bce01a7fe2ab9620f311a4a4427f3dea846fc15a329aea1b84637fd0ecc056dfe7c34d712effbb0f22828fd3a05f902426c8d50c84779f103"

RPROVIDES:${PN} += "libboost_log-devel-impl \
libboost_log1_82_0-devel \
libboost_log1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_atomic1_82_0-devel \
libboost_chrono1_82_0-devel \
libboost_date_time1_82_0-devel \
libboost_filesystem1_82_0-devel \
libboost_headers1_82_0-devel \
libboost_log1_82_0 \
libboost_regex1_82_0-devel \
libboost_thread1_82_0"

inherit rpm
