SUMMARY = "Python bindings for FCD and FCDpro Plus"
DESCRIPTION = "gr-funcube is an linux oot-module for gnuradio to implement a FUNcube \
Dongle and a FUNcube Dongle PRO+ source. It autodetects the correct \
soundcard from /proc/asound/cards. This idea was taken from the osmosdr \
 drivers. To control the device, the hidraw code of the HID API is used."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "python3-gr-funcube-3.10.0.rc3-1.4.aarch64.rpm"
RPM_HASH = "96c35a06779620b2ca470819f7188fc2c1b336d722e8b8ac4f6d1509fa31dea9eca86b97f0760ad1b045775644408890fece07681008ad9e3f3e601a75e98abe"

RPROVIDES:${PN} += "python3-gr-funcube"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnuradio-funcube.so.3.10.0 \
libgnuradio-funcube3-10-0 \
libgnuradio-runtime.so.3.10.7 \
libstdc++.so.6 \
python-abi"

inherit rpm
