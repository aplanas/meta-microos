SUMMARY = "GNU Radio documentation"
DESCRIPTION = "GNU Radio is a collection of software that when combined with minimal \
hardware, allows the construction of radios where the actual waveforms \
transmitted and received are defined by software. What this means is \
that it turns the digital modulation schemes used in today's high \
performance wireless devices into software problems. \
 \
This package contains documentation for GNU Radio."
LICENSE = "GPL-3.0-or-later"

PV = "3.10.6.0"

RPM_NAME = "gnuradio-doc-3.10.6.0-4.4.noarch.rpm"
RPM_HASH = "433f6c2288a8612c2875e83813d8a9ec1b4844dac4a99cb6ec27e45bdc3b2c07ef2a7a73ee0a33676ff0983ef6e4082971700e46e0f74d4556706d508cbf3a24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuradio-doc"

RDEPENDS:${PN} += "gnuradio"

inherit rpm
