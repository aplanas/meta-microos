SUMMARY = "FCD and FCDpro Plus Linux addon for gnuradio"
DESCRIPTION = "gr-funcube is an linux oot-module for gnuradio to implement a FUNcube \
Dongle and a FUNcube Dongle PRO+ source. It autodetects the correct \
soundcard from /proc/asound/cards. This idea was taken from the osmosdr \
 drivers. To control the device, the hidraw code of the HID API is used."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "libgnuradio-funcube3_10_0-3.10.0.rc3-1.4.aarch64.rpm"
RPM_HASH = "9a3e07115a0c15fc3b8aa673b4ef30ce83a298371494dcff4ec28d011af3fbfeef53b1b69d77cd1d781dc17749d83e0f057bc77b3de184950b34b5f576f6d246"

RPROVIDES:${PN} += "libgnuradio-funcube.so.3.10.0 \
libgnuradio-funcube3-10-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfmt.so.9 \
libgcc-s.so.1 \
libgnuradio-audio.so.3.10.7 \
libgnuradio-blocks.so.3.10.7 \
libgnuradio-pmt.so.3.10.7 \
libgnuradio-runtime.so.3.10.7 \
libhidapi-libusb.so.0 \
libspdlog.so.1.12 \
libstdc++.so.6"

inherit rpm
