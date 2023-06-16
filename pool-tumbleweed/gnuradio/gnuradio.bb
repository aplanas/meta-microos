SUMMARY = "GNU software radio"
DESCRIPTION = "GNU Radio is a collection of software that when combined with minimal \
hardware, allows the construction of radios where the actual waveforms \
transmitted and received are defined by software. What this means is \
that it turns the digital modulation schemes used in today's high \
performance wireless devices into software problems."
LICENSE = "GPL-3.0-or-later"

PV = "3.10.6.0"

RPM_NAME = "gnuradio-3.10.6.0-4.2.aarch64.rpm"
RPM_HASH = "fbb1f560fb9ea7a6923b4a7ae905b0cd588db9a17b8d5e557fbc0b0139a687f74bc299a181a7d1f993bb2949380354df635e3d8ede5a653509465946b57cf9b1"

RPROVIDES:${PN} += "config-gnuradio \
gnuradio"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libQt5Widgets.so.5 \
libSoapySDR.so.0.8 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libfmt.so.9 \
libgcc-s.so.1 \
libgmp.so.10 \
libgnuradio-analog.so.3.10.6 \
libgnuradio-audio.so.3.10.6 \
libgnuradio-blocks.so.3.10.6 \
libgnuradio-channels.so.3.10.6 \
libgnuradio-digital.so.3.10.6 \
libgnuradio-dtv.so.3.10.6 \
libgnuradio-fec.so.3.10.6 \
libgnuradio-fft.so.3.10.6 \
libgnuradio-filter.so.3.10.6 \
libgnuradio-iio.so.3.10.6 \
libgnuradio-network.so.3.10.6 \
libgnuradio-pdu.so.3.10.6 \
libgnuradio-pmt.so.3.10.6 \
libgnuradio-qtgui.so.3.10.6 \
libgnuradio-runtime.so.3.10.6 \
libgnuradio-soapy.so.3.10.6 \
libgnuradio-trellis.so.3.10.6 \
libgnuradio-uhd.so.3.10.6 \
libgnuradio-video-sdl.so.3.10.6 \
libgnuradio-vocoder.so.3.10.6 \
libgnuradio-wavelet.so.3.10.6 \
libgnuradio-zeromq.so.3.10.6 \
libm.so.6 \
libspdlog.so.1.11 \
libstdc++.so.6 \
libuhd.so.4.4.0 \
libvolk.so.3.0 \
python-abi \
python3-SoapySDR \
python3-cairo \
python3-click \
python3-click-plugins \
python3-gobject-Gdk \
python3-jsonschema \
python3-mako \
python3-numpy \
python3-pyaml \
python3-pyqtgraph \
python3-pyzmq \
python3-qt5 \
python3-scipy \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo"

inherit rpm
