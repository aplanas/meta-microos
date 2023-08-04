SUMMARY = "GNU Radio documentation"
DESCRIPTION = "GNU Radio is a collection of software that when combined with minimal \
hardware, allows the construction of radios where the actual waveforms \
transmitted and received are defined by software. What this means is \
that it turns the digital modulation schemes used in today's high \
performance wireless devices into software problems. \
 \
This package contains documentation for GNU Radio."
LICENSE = "GPL-3.0-or-later"

PV = "3.10.7.0"

RPM_NAME = "gnuradio-doc-3.10.7.0-1.2.noarch.rpm"
RPM_HASH = "dccfb8ace6139353df8b03393137c15eebbd5cb5e2d672bed109e4ca7047e30b9fc9287580b923375f2ddc76077fde8c6dda60185fe6f47c8a404a2ff4f5c9e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuradio-doc"

RDEPENDS:${PN} += "gnuradio"

inherit rpm
