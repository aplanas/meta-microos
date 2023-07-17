SUMMARY = "Python bindings for FCD and FCDpro Plus"
DESCRIPTION = "gr-funcube is an linux oot-module for gnuradio to implement a FUNcube \
Dongle and a FUNcube Dongle PRO+ source. It autodetects the correct \
soundcard from /proc/asound/cards. This idea was taken from the osmosdr \
 drivers. To control the device, the hidraw code of the HID API is used."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "python3-gr-funcube-3.10.0.rc3-1.3.aarch64.rpm"
RPM_HASH = "0c7b26aa1d9ed2045bec442f43226c0f92bf9b4324281b4eda05d60d9b06923338fc9db3464ebdfb5e9714029357134eeff28aaf842509e39236bd58479ae8fd"

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
