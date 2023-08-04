SUMMARY = "GNU software radio"
DESCRIPTION = "GNU Radio is a collection of software that when combined with minimal \
hardware, allows the construction of radios where the actual waveforms \
transmitted and received are defined by software. What this means is \
that it turns the digital modulation schemes used in today's high \
performance wireless devices into software problems."
LICENSE = "GPL-3.0-or-later"

PV = "3.10.7.0"

RPM_NAME = "gnuradio-3.10.7.0-1.2.aarch64.rpm"
RPM_HASH = "c7d4186662af7dc21d3c74a67752400a1b946123afb62734dda3c3edefe111e36cce068132c087da1cfe1c89e179aeb7ddcaae6ecc2519be9005cc10aef8465e"

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
libgnuradio-analog.so.3.10.7 \
libgnuradio-audio.so.3.10.7 \
libgnuradio-blocks.so.3.10.7 \
libgnuradio-channels.so.3.10.7 \
libgnuradio-digital.so.3.10.7 \
libgnuradio-dtv.so.3.10.7 \
libgnuradio-fec.so.3.10.7 \
libgnuradio-fft.so.3.10.7 \
libgnuradio-filter.so.3.10.7 \
libgnuradio-iio.so.3.10.7 \
libgnuradio-network.so.3.10.7 \
libgnuradio-pdu.so.3.10.7 \
libgnuradio-pmt.so.3.10.7 \
libgnuradio-qtgui.so.3.10.7 \
libgnuradio-runtime.so.3.10.7 \
libgnuradio-soapy.so.3.10.7 \
libgnuradio-trellis.so.3.10.7 \
libgnuradio-uhd.so.3.10.7 \
libgnuradio-video-sdl.so.3.10.7 \
libgnuradio-vocoder.so.3.10.7 \
libgnuradio-wavelet.so.3.10.7 \
libgnuradio-zeromq.so.3.10.7 \
libm.so.6 \
libspdlog.so.1.12 \
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
