SUMMARY = "Development files for the FCD and FCDpro Plus addon"
DESCRIPTION = "gr-funcube is an linux oot-module for gnuradio to implement a FUNcube \
Dongle and a FUNcube Dongle PRO+ source. It autodetects the correct \
soundcard from /proc/asound/cards. This idea was taken from the osmosdr \
 drivers. To control the device, the hidraw code of the HID API is used."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "libgnuradio-funcube-devel-3.10.0.rc3-1.4.aarch64.rpm"
RPM_HASH = "1cedd0e653579d5375f136f703dbe02f62170761a2df806d4637ff1d59ecee69fbca726d47c2b7b0bce313d7c1964668d904bf511ee109e8606ac977411347c5"

RPROVIDES:${PN} += "cmake-funcube \
cmake-gnuradio-funcube \
libgnuradio-funcube-devel"

RDEPENDS:${PN} += "libgnuradio-funcube3-10-0"

inherit rpm
