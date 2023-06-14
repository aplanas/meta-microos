SUMMARY = "Python bindings for FCD and FCDpro Plus"
DESCRIPTION = "gr-funcube is an linux oot-module for gnuradio to implement a FUNcube \
Dongle and a FUNcube Dongle PRO+ source. It autodetects the correct \
soundcard from /proc/asound/cards. This idea was taken from the osmosdr \
 drivers. To control the device, the hidraw code of the HID API is used."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "python3-gr-funcube-3.10.0.rc3-1.1.aarch64.rpm"
RPM_HASH = "891f97d96d46273d475f86e384f04953bbc4c959f47a0ec9f742c7a1123ff3371a784880fea8bb281eccd153902f5d7efc0e690e6f6bf5d8d77958a3326fd494"

RPROVIDES:${PN} += "python3-gr-funcube"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnuradio-funcube.so.3.10.0 \
libgnuradio-funcube3-10-0 \
libgnuradio-runtime.so.3.10.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
