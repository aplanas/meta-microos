SUMMARY = "Library for gr-osmosdr"
DESCRIPTION = "OsmoSDR Gnuradio Source supports the OsmoSDR hardware, but it also offers a \
wrapper functionality for FunCube Dongle, Ettus UHD and rtl-sdr radios."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "libgnuradio-osmosdr0_2_0-0.2.4-1.1.aarch64.rpm"
RPM_HASH = "8c420b9c6c7d4c9d9383387547a6c569b62077b9aa5645a9681649e3eb0882f7f9f0baae13b862135c8504ce576ca841e1b522b72ce5f4b63984cf8f0eccd2a7"

RPROVIDES:${PN} += "libgnuradio-osmosdr.so.0.2.0()(64bit) \
libgnuradio-osmosdr0_2_0 \
libgnuradio-osmosdr0_2_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libSoapySDR.so.0.8()(64bit) \
libairspy.so.0()(64bit) \
libairspyhf.so.0()(64bit) \
libbladeRF.so.2()(64bit) \
libboost_chrono.so.1.82.0()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgnuradio-blocks.so.3.10.6()(64bit) \
libgnuradio-funcube.so.3.10.0()(64bit) \
libgnuradio-iqbalance.so.3.9.0()(64bit) \
libgnuradio-pmt.so.3.10.6()(64bit) \
libgnuradio-runtime.so.3.10.6()(64bit) \
libgnuradio-uhd.so.3.10.6()(64bit) \
libhackrf.so.0()(64bit) \
libmirisdr.so.0()(64bit) \
librtlsdr.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libuhd.so.4.4.0()(64bit) \
libvolk.so.3.0()(64bit)"

inherit rpm
