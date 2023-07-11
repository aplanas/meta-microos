SUMMARY = "Python bindings for FCD and FCDpro Plus"
DESCRIPTION = "gr-funcube is an linux oot-module for gnuradio to implement a FUNcube \
Dongle and a FUNcube Dongle PRO+ source. It autodetects the correct \
soundcard from /proc/asound/cards. This idea was taken from the osmosdr \
 drivers. To control the device, the hidraw code of the HID API is used."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "python3-gr-funcube-3.10.0.rc3-1.2.aarch64.rpm"
RPM_HASH = "64be46669cfa3f107dded67cebd0914a39c4c7e76a56d40a0c58fd07e1e6239679262d4ca88d3f5e00b4ac8f2d9fd23afca07bd677b0114e81fc43e72ee63e46"

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
