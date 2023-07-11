SUMMARY = "Development files for gr-iqbal"
DESCRIPTION = "Library headers for gr-iqbal, I/Q balancing for GNU Radio"
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20210108"

RPM_NAME = "libgnuradio-iqbalance-devel-0.39.0git20210108-1.13.aarch64.rpm"
RPM_HASH = "83129b13256a0477bf2100e0a89251d87475c5ec1925adaa3cc9ef8d04ca8ac9509706b02782ea3e6f842211f08caa054ee085494b464088118f3ce2a0d558dd"

RPROVIDES:${PN} += "cmake-gnuradio-iqbalance \
libgnuradio-iqbalance-devel"

RDEPENDS:${PN} += "libgnuradio-iqbalance3-9-0"

inherit rpm
