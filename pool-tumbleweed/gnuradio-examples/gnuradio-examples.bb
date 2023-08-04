SUMMARY = "GNU Radio examples"
DESCRIPTION = "GNU Radio is a collection of software that when combined with minimal \
hardware, allows the construction of radios where the actual waveforms \
transmitted and received are defined by software. What this means is \
that it turns the digital modulation schemes used in today's high \
performance wireless devices into software problems. \
 \
This package contains some examples of using GNU Radio."
LICENSE = "GPL-3.0-or-later"

PV = "3.10.7.0"

RPM_NAME = "gnuradio-examples-3.10.7.0-1.2.aarch64.rpm"
RPM_HASH = "2337b0b447c91d084d92bbb7a847fdeafc03c0f3528eaac587a3835db17d298657786a062143e5bbe209bc0990e4aea33bd9b462ed0bd57457440f8ba6a08f6f"

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
libgnuradio-analog.so.3.10.7 \
libgnuradio-audio.so.3.10.7 \
libgnuradio-blocks.so.3.10.7 \
libgnuradio-pmt.so.3.10.7 \
libgnuradio-qtgui.so.3.10.7 \
libgnuradio-runtime.so.3.10.7 \
libgnuradio-uhd.so.3.10.7 \
libspdlog.so.1.12 \
libstdc++.so.6 \
libuhd.so.4.4.0"

inherit rpm
