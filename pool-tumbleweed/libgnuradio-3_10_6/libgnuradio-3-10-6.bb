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

RPM_NAME = "libgnuradio-3_10_6-3.10.6.0-4.2.aarch64.rpm"
RPM_HASH = "4532d7903bfc07a754beb2ba694ed393050a764593b9bcbf251e2cd6b62be16fce91445143b4214afbd3313ede2b08b57483c92a019366a1c0dbde446dd4c7a1"

RPROVIDES:${PN} += "libgnuradio-3_10_6 \
libgnuradio-3_10_6(aarch-64) \
libgnuradio-analog.so.3.10.6()(64bit) \
libgnuradio-audio.so.3.10.6()(64bit) \
libgnuradio-blocks.so.3.10.6()(64bit) \
libgnuradio-channels.so.3.10.6()(64bit) \
libgnuradio-digital.so.3.10.6()(64bit) \
libgnuradio-dtv.so.3.10.6()(64bit) \
libgnuradio-fec.so.3.10.6()(64bit) \
libgnuradio-fft.so.3.10.6()(64bit) \
libgnuradio-filter.so.3.10.6()(64bit) \
libgnuradio-iio.so.3.10.6()(64bit) \
libgnuradio-network.so.3.10.6()(64bit) \
libgnuradio-pdu.so.3.10.6()(64bit) \
libgnuradio-pmt.so.3.10.6()(64bit) \
libgnuradio-qtgui.so.3.10.6()(64bit) \
libgnuradio-runtime.so.3.10.6()(64bit) \
libgnuradio-soapy.so.3.10.6()(64bit) \
libgnuradio-trellis.so.3.10.6()(64bit) \
libgnuradio-uhd.so.3.10.6()(64bit) \
libgnuradio-video-sdl.so.3.10.6()(64bit) \
libgnuradio-vocoder.so.3.10.6()(64bit) \
libgnuradio-wavelet.so.3.10.6()(64bit) \
libgnuradio-zeromq.so.3.10.6()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libSDL-1.2.so.0()(64bit) \
libSoapySDR.so.0.8()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcodec2.so.1.1()(64bit) \
libfftw3f.so.3()(64bit) \
libfftw3f_threads.so.3()(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.5.0)(64bit) \
libgmp.so.10()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libgsm.so.1()(64bit) \
libiio.so.0()(64bit) \
libjack.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.23)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libportaudio.so.2()(64bit) \
libqwt-qt5.so.6.2()(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libspdlog.so.1.11()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libthrift-0.17.0.so()(64bit) \
libuhd.so.4.4.0()(64bit) \
libunwind.so.8()(64bit) \
libvolk.so.3.0()(64bit) \
libzmq.so.5()(64bit)"

inherit rpm
