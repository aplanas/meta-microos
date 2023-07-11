SUMMARY = "Development files for the FCD and FCDpro Plus addon"
DESCRIPTION = "gr-funcube is an linux oot-module for gnuradio to implement a FUNcube \
Dongle and a FUNcube Dongle PRO+ source. It autodetects the correct \
soundcard from /proc/asound/cards. This idea was taken from the osmosdr \
 drivers. To control the device, the hidraw code of the HID API is used."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "libgnuradio-funcube-devel-3.10.0.rc3-1.2.aarch64.rpm"
RPM_HASH = "020b6995569356399f880328c292a6b7b9692298782fe768a43114786e298917f90a493494e33c548f0282dce25cc38fa62e969effdb21aa4289bba5c990873d"

RPROVIDES:${PN} += "cmake-funcube \
cmake-gnuradio-funcube \
libgnuradio-funcube-devel"

RDEPENDS:${PN} += "libgnuradio-funcube3-10-0"

inherit rpm
