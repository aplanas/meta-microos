SUMMARY = "Development headers for Boost.Timer library"
DESCRIPTION = "This package contains development headers for Boost.Timer library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_timer1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "132b31491e88c20c5a99f4a97b20c16b8e90654be905930c05be488b08d9c35a279206a5fc86feea7bb17a7bbd5dd676c7baf61da8c0672ac979ec426207c6b9"

RPROVIDES:${PN} += "libboost-timer-devel-impl \
libboost-timer1-82-0-devel"

RDEPENDS:${PN} += "libboost-chrono1-82-0-devel \
libboost-headers1-82-0-devel \
libboost-timer1-82-0"

inherit rpm
