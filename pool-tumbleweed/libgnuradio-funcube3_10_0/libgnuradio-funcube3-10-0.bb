SUMMARY = "FCD and FCDpro Plus Linux addon for gnuradio"
DESCRIPTION = "gr-funcube is an linux oot-module for gnuradio to implement a FUNcube \
Dongle and a FUNcube Dongle PRO+ source. It autodetects the correct \
soundcard from /proc/asound/cards. This idea was taken from the osmosdr \
 drivers. To control the device, the hidraw code of the HID API is used."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "libgnuradio-funcube3_10_0-3.10.0.rc3-1.2.aarch64.rpm"
RPM_HASH = "2ea9a28d9e92bf31351ac9920793027d717e3a9bbb502a5d1e1e969fbeec3a8586a1781682cef8b8a5d6ca7d518c036ee33508604bf971a703bac92c94f0d95e"

RPROVIDES:${PN} += "libgnuradio-funcube.so.3.10.0 \
libgnuradio-funcube3-10-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfmt.so.9 \
libgcc-s.so.1 \
libgnuradio-audio.so.3.10.6 \
libgnuradio-blocks.so.3.10.6 \
libgnuradio-pmt.so.3.10.6 \
libgnuradio-runtime.so.3.10.6 \
libhidapi-libusb.so.0 \
libspdlog.so.1.11 \
libstdc++.so.6"

inherit rpm
