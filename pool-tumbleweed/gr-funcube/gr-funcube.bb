SUMMARY = "FCD and FCDpro Plus Linux addon for gnuradio"
DESCRIPTION = "gr-funcube is an linux oot-module for gnuradio to implement a FUNcube \
Dongle and a FUNcube Dongle PRO+ source. It autodetects the correct \
soundcard from /proc/asound/cards. This idea was taken from the osmosdr \
 drivers. To control the device, the hidraw code of the HID API is used."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "gr-funcube-3.10.0.rc3-1.2.aarch64.rpm"
RPM_HASH = "af4df57af45b20f12bee47d3fb92b2bfa473fa8cf2f69d4786529dbab22599f0f9a3b6303853c8b22080734d7c485188ef270f17de1e6eedaeb6f56f023a2f7b"

RPROVIDES:${PN} += "gr-funcube"

RDEPENDS:${PN} += ""

inherit rpm
