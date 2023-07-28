SUMMARY = "Development files for gr-iqbal"
DESCRIPTION = "Library headers for gr-iqbal, I/Q balancing for GNU Radio"
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20210108"

RPM_NAME = "libgnuradio-iqbalance-devel-0.39.0git20210108-1.14.aarch64.rpm"
RPM_HASH = "2095976249b1c16746df72ae03b4290c94ee603333e33314db8a4a7852b81664a43119713a77aeca05c6f310234c307125f70af24a2d36ae35732849707fa661"

RPROVIDES:${PN} += "cmake-gnuradio-iqbalance \
libgnuradio-iqbalance-devel"

RDEPENDS:${PN} += "libgnuradio-iqbalance3-9-0"

inherit rpm
