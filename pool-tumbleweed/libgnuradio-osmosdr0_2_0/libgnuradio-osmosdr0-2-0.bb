SUMMARY = "Library for gr-osmosdr"
DESCRIPTION = "OsmoSDR Gnuradio Source supports the OsmoSDR hardware, but it also offers a \
wrapper functionality for FunCube Dongle, Ettus UHD and rtl-sdr radios."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "libgnuradio-osmosdr0_2_0-0.2.4-1.3.aarch64.rpm"
RPM_HASH = "2e97602f292e95893c44d064f9e9dc3a867d09e1133cd215ec81fc7e8e6e0f1c12748c2f51de01dbefe48701932abc93a54f11c1aeb6490e092d8ec73f34acce"

RPROVIDES:${PN} += "libgnuradio-osmosdr.so.0.2.0 \
libgnuradio-osmosdr0-2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8 \
libairspy.so.0 \
libairspyhf.so.0 \
libbladeRF.so.2 \
libboost-chrono.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libgnuradio-blocks.so.3.10.7 \
libgnuradio-funcube.so.3.10.0 \
libgnuradio-iqbalance.so.3.9.0 \
libgnuradio-pmt.so.3.10.7 \
libgnuradio-runtime.so.3.10.7 \
libgnuradio-uhd.so.3.10.7 \
libhackrf.so.0 \
libmirisdr.so.0 \
librtlsdr.so.0 \
libstdc++.so.6 \
libuhd.so.4.4.0 \
libvolk.so.3.0"

inherit rpm
