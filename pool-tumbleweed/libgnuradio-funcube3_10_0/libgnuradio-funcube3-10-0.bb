SUMMARY = "FCD and FCDpro Plus Linux addon for gnuradio"
DESCRIPTION = "gr-funcube is an linux oot-module for gnuradio to implement a FUNcube \
Dongle and a FUNcube Dongle PRO+ source. It autodetects the correct \
soundcard from /proc/asound/cards. This idea was taken from the osmosdr \
 drivers. To control the device, the hidraw code of the HID API is used."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "libgnuradio-funcube3_10_0-3.10.0.rc3-1.1.aarch64.rpm"
RPM_HASH = "9a8bcd0c1c5156c94b4a692f88ff0ab4ce0a4792f2686fa81c18cc6ff5d6947856c1d0129d8b72c3628ed6df5cca55d93f5ea73d03f82508365be4b06e5801ac"

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
