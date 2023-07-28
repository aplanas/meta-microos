SUMMARY = "Deveopment files for GNU Radio"
DESCRIPTION = "GNU Radio is a collection of software that when combined with minimal \
hardware, allows the construction of radios where the actual waveforms \
transmitted and received are defined by software. What this means is \
that it turns the digital modulation schemes used in today's high \
performance wireless devices into software problems. \
 \
This package contains libraries and header files for developing \
applications that use GNU Radio."
LICENSE = "GPL-3.0-or-later"

PV = "3.10.7.0"

RPM_NAME = "gnuradio-devel-3.10.7.0-1.1.aarch64.rpm"
RPM_HASH = "e1dd7dc61ce54db7d19c447ff14970958cb3382076e6a973f7b314b12b565e8b193679909bd99f7e7f6cd77dbceb6e07f4ab60a99bfe7c48be8d5de54f6d9475"

RPROVIDES:${PN} += "cmake-Gnuradio \
cmake-gnuradio-analog \
cmake-gnuradio-audio \
cmake-gnuradio-blocks \
cmake-gnuradio-channels \
cmake-gnuradio-digital \
cmake-gnuradio-dtv \
cmake-gnuradio-fec \
cmake-gnuradio-fft \
cmake-gnuradio-filter \
cmake-gnuradio-iio \
cmake-gnuradio-network \
cmake-gnuradio-pdu \
cmake-gnuradio-pmt \
cmake-gnuradio-qtgui \
cmake-gnuradio-runtime \
cmake-gnuradio-soapy \
cmake-gnuradio-trellis \
cmake-gnuradio-uhd \
cmake-gnuradio-video-sdl \
cmake-gnuradio-vocoder \
cmake-gnuradio-wavelet \
cmake-gnuradio-zeromq \
gnuradio-devel \
pkgconfig-gnuradio-analog \
pkgconfig-gnuradio-audio \
pkgconfig-gnuradio-blocks \
pkgconfig-gnuradio-channels \
pkgconfig-gnuradio-digital \
pkgconfig-gnuradio-dtv \
pkgconfig-gnuradio-fec \
pkgconfig-gnuradio-fft \
pkgconfig-gnuradio-filter \
pkgconfig-gnuradio-iio \
pkgconfig-gnuradio-network \
pkgconfig-gnuradio-pdu \
pkgconfig-gnuradio-qtgui \
pkgconfig-gnuradio-runtime \
pkgconfig-gnuradio-soapy \
pkgconfig-gnuradio-trellis \
pkgconfig-gnuradio-uhd \
pkgconfig-gnuradio-video-sdl \
pkgconfig-gnuradio-vocoder \
pkgconfig-gnuradio-wavelet \
pkgconfig-gnuradio-zeromq"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gmp-devel \
gnuradio \
pkgconfig-gnuradio-analog \
pkgconfig-gnuradio-blocks \
pkgconfig-gnuradio-fft \
pkgconfig-gnuradio-filter \
pkgconfig-gnuradio-runtime \
pkgconfig-sdl \
pkgconfig-volk \
spdlog-devel"

inherit rpm
