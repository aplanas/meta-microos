SUMMARY = "Development package for kdav"
DESCRIPTION = "This package contains development files needed to use kdav in other applications."
LICENSE = "LGPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "kdav-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "62f16dfc54599104f7ce0f5bbabebdd1b30384b005c2317cdd2c97e6ec16c8b6d745e62856800bf353ae0635f3927c46027c769362e32fc1ef46e46764afe07c"

RPROVIDES:${PN} += "cmake-KF5DAV \
kdav-devel"

RDEPENDS:${PN} += "libKF5DAV5"

inherit rpm
