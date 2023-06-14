SUMMARY = "Software defined radio receiver"
DESCRIPTION = "Gqrx is an experimental software defined radio receiver implemented using \
GNU Radio and the Qt GUI toolkit. Currently it works on Linux and Mac and it \
can use the Funcube Dongle, RTL2832U-based DVB-T dongles, OsmoSDR devices and \
USRP devices as input source."
LICENSE = "GPL-3.0-only"

PV = "2.16"

RPM_NAME = "gqrx-2.16-1.1.aarch64.rpm"
RPM_HASH = "9f0c204e9cb45a9fd7da6c5357c77c6c8fec267bc92336711d4de7472bce215d13b8afc7236886f32038351f16ab3d71ad32b12449c64c6480a72024c50b7f54"

RPROVIDES:${PN} += "gqrx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgnuradio-analog.so.3.10.6 \
libgnuradio-blocks.so.3.10.6 \
libgnuradio-digital.so.3.10.6 \
libgnuradio-fft.so.3.10.6 \
libgnuradio-filter.so.3.10.6 \
libgnuradio-network.so.3.10.6 \
libgnuradio-osmosdr.so.0.2.0 \
libgnuradio-pmt.so.3.10.6 \
libgnuradio-runtime.so.3.10.6 \
libm.so.6 \
libpulse-simple.so.0 \
libpulse.so.0 \
libstdc++.so.6 \
libvolk.so.3.0"

inherit rpm
