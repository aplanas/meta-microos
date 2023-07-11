SUMMARY = "Library for gr-osmosdr"
DESCRIPTION = "OsmoSDR Gnuradio Source supports the OsmoSDR hardware, but it also offers a \
wrapper functionality for FunCube Dongle, Ettus UHD and rtl-sdr radios."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "libgnuradio-osmosdr0_2_0-0.2.4-1.2.aarch64.rpm"
RPM_HASH = "7818ccaeec2f653a0438f94da4d1ea9dc5d4b6d01547c4609d68cb4d7bb3e718935869b605e164e2457b211ab057737d3906f06524f4b3aa736db36fb8ef61db"

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
libgnuradio-blocks.so.3.10.6 \
libgnuradio-funcube.so.3.10.0 \
libgnuradio-iqbalance.so.3.9.0 \
libgnuradio-pmt.so.3.10.6 \
libgnuradio-runtime.so.3.10.6 \
libgnuradio-uhd.so.3.10.6 \
libhackrf.so.0 \
libmirisdr.so.0 \
librtlsdr.so.0 \
libstdc++.so.6 \
libuhd.so.4.4.0 \
libvolk.so.3.0"

inherit rpm
