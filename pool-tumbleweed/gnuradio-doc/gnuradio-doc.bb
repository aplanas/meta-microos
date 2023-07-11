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

RPM_NAME = "gnuradio-doc-3.10.6.0-4.3.noarch.rpm"
RPM_HASH = "86b1e3dc61ffe941ab93202b481b5e7d7a07d5771181951e5aa78ec080f385d7ff9ed5cbd33f4330b2fbe5bb0fc361e12440649fb5d7505a13c2c23913295ea4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuradio-doc"

RDEPENDS:${PN} += "gnuradio"

inherit rpm
