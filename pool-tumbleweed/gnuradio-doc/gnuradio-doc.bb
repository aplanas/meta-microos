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

RPM_NAME = "gnuradio-doc-3.10.7.0-1.1.noarch.rpm"
RPM_HASH = "53feb17ad9259208fd801a1ef179a1ff0132848212faf228c2304733d18162166e09a2c2f4e0dccf2c997a3d56661d411b4b583ccf63e70ab4e41f66fc819e3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuradio-doc"

RDEPENDS:${PN} += "gnuradio"

inherit rpm
