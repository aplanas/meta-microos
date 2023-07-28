SUMMARY = "Software defined radio receiver"
DESCRIPTION = "Gqrx is an experimental software defined radio receiver implemented using \
GNU Radio and the Qt GUI toolkit. Currently it works on Linux and Mac and it \
can use the Funcube Dongle, RTL2832U-based DVB-T dongles, OsmoSDR devices and \
USRP devices as input source."
LICENSE = "GPL-3.0-only"

PV = "2.16"

RPM_NAME = "gqrx-2.16-1.3.aarch64.rpm"
RPM_HASH = "b2d8656292c24bd4bb50960753c3d6df108ee4568bdf0e9c4d2e13cbaeeea7027a531d4af2a17a2c5917f9b6119b1bc9b6bbd43f490afdc3260c5c89e087144b"

RPROVIDES:${PN} += "gqrx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgnuradio-analog.so.3.10.7 \
libgnuradio-blocks.so.3.10.7 \
libgnuradio-digital.so.3.10.7 \
libgnuradio-fft.so.3.10.7 \
libgnuradio-filter.so.3.10.7 \
libgnuradio-network.so.3.10.7 \
libgnuradio-osmosdr.so.0.2.0 \
libgnuradio-pmt.so.3.10.7 \
libgnuradio-runtime.so.3.10.7 \
libm.so.6 \
libpulse-simple.so.0 \
libpulse.so.0 \
libstdc++.so.6 \
libvolk.so.3.0"

inherit rpm
