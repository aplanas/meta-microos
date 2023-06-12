SUMMARY = "Software defined radio receiver"
DESCRIPTION = "Gqrx is an experimental software defined radio receiver implemented using \
GNU Radio and the Qt GUI toolkit. Currently it works on Linux and Mac and it \
can use the Funcube Dongle, RTL2832U-based DVB-T dongles, OsmoSDR devices and \
USRP devices as input source."
LICENSE = "GPL-3.0-only"

PV = "2.16"

RPM_NAME = "gqrx-2.16-1.1.aarch64.rpm"
RPM_HASH = "9f0c204e9cb45a9fd7da6c5357c77c6c8fec267bc92336711d4de7472bce215d13b8afc7236886f32038351f16ab3d71ad32b12449c64c6480a72024c50b7f54"

RPROVIDES:${PN} += "application() \
application(dk.gqrx.gqrx.desktop) \
gqrx \
gqrx(aarch-64) \
metainfo() \
metainfo(dk.gqrx.gqrx.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgnuradio-analog.so.3.10.6()(64bit) \
libgnuradio-blocks.so.3.10.6()(64bit) \
libgnuradio-digital.so.3.10.6()(64bit) \
libgnuradio-fft.so.3.10.6()(64bit) \
libgnuradio-filter.so.3.10.6()(64bit) \
libgnuradio-network.so.3.10.6()(64bit) \
libgnuradio-osmosdr.so.0.2.0()(64bit) \
libgnuradio-pmt.so.3.10.6()(64bit) \
libgnuradio-runtime.so.3.10.6()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpulse-simple.so.0()(64bit) \
libpulse-simple.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libvolk.so.3.0()(64bit)"

inherit rpm
