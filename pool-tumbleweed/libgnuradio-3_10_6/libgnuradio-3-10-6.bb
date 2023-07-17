SUMMARY = "Libraries for GNU Radio"
DESCRIPTION = "GNU Radio is a collection of software that when combined with minimal \
hardware, allows the construction of radios where the actual waveforms \
transmitted and received are defined by software. What this means is \
that it turns the digital modulation schemes used in today's high \
performance wireless devices into software problems. \
 \
This package contains the libraries for GNU Radio."
LICENSE = "GPL-3.0-or-later"

PV = "3.10.6.0"

RPM_NAME = "libgnuradio-3_10_6-3.10.6.0-4.4.aarch64.rpm"
RPM_HASH = "458319316227c002e9d49fdad2ce6ea0a9bf5f69abb7dee7a63a1059f35296b409f7a0439b3e57e7751930258efa1e5c0bacc3ace3546dc56d3a081d38eed73b"

RPROVIDES:${PN} += "libgnuradio-3-10-6 \
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
libgnuradio-zeromq.so.3.10.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libSDL-1.2.so.0 \
libSoapySDR.so.0.8 \
libasound.so.2 \
libboost-program-options.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libcodec2.so.1.1 \
libfftw3f-threads.so.3 \
libfftw3f.so.3 \
libfmt.so.9 \
libgcc-s.so.1 \
libgmp.so.10 \
libgsl.so.27 \
libgslcblas.so.0 \
libgsm.so.1 \
libiio.so.0 \
libjack.so.0 \
libm.so.6 \
libportaudio.so.2 \
libqwt-qt5.so.6.2 \
libsndfile.so.1 \
libspdlog.so.1.12 \
libstdc++.so.6 \
libthrift-0.17.0.so \
libuhd.so.4.4.0 \
libunwind.so.8 \
libvolk.so.3.0 \
libzmq.so.5"

inherit rpm
