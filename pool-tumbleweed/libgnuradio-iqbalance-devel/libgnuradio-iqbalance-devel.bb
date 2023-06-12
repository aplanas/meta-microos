SUMMARY = "Development files for gr-iqbal"
DESCRIPTION = "Library headers for gr-iqbal, I/Q balancing for GNU Radio"
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20210108"

RPM_NAME = "libgnuradio-iqbalance-devel-0.39.0git20210108-1.12.aarch64.rpm"
RPM_HASH = "242881db8415ee1fa158db25bb84290e72bbbfdeda7eba7aa1e933e65f9dda8e660ace405538cf2d9673ccd4694ac318bbd97e1319d886ea9718da108ec5c1bc"

RPROVIDES:${PN} += "cmake(gnuradio-iqbalance) \
libgnuradio-iqbalance-devel \
libgnuradio-iqbalance-devel(aarch-64)"
RDEPENDS:${PN} += "libgnuradio-iqbalance3_9_0"

inherit rpm
