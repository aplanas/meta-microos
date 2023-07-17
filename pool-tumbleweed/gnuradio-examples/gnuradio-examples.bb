SUMMARY = "GNU Radio examples"
DESCRIPTION = "GNU Radio is a collection of software that when combined with minimal \
hardware, allows the construction of radios where the actual waveforms \
transmitted and received are defined by software. What this means is \
that it turns the digital modulation schemes used in today's high \
performance wireless devices into software problems. \
 \
This package contains some examples of using GNU Radio."
LICENSE = "GPL-3.0-or-later"

PV = "3.10.6.0"

RPM_NAME = "gnuradio-examples-3.10.6.0-4.4.aarch64.rpm"
RPM_HASH = "8d3bc641399b319f18966faf6ae8864288c396cc171686b813ae3d385b6b29a9ef027c3379efa7f248b9d8355b4359e5e1441e75ab32a4c67652bfa75f9d1a8f"

RPROVIDES:${PN} += "gnuradio-examples"

RDEPENDS:${PN} += "/usr/bin/python3 \
gnuradio \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Widgets.so.5 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libfmt.so.9 \
libgcc-s.so.1 \
libgnuradio-analog.so.3.10.6 \
libgnuradio-audio.so.3.10.6 \
libgnuradio-blocks.so.3.10.6 \
libgnuradio-pmt.so.3.10.6 \
libgnuradio-qtgui.so.3.10.6 \
libgnuradio-runtime.so.3.10.6 \
libgnuradio-uhd.so.3.10.6 \
libspdlog.so.1.12 \
libstdc++.so.6 \
libuhd.so.4.4.0"

inherit rpm
