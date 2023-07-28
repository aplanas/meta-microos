SUMMARY = "FCD and FCDpro Plus Linux addon for gnuradio"
DESCRIPTION = "gr-funcube is an linux oot-module for gnuradio to implement a FUNcube \
Dongle and a FUNcube Dongle PRO+ source. It autodetects the correct \
soundcard from /proc/asound/cards. This idea was taken from the osmosdr \
 drivers. To control the device, the hidraw code of the HID API is used."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "gr-funcube-3.10.0.rc3-1.4.aarch64.rpm"
RPM_HASH = "bb3d2d3326d4a4a2d33e7df669dca5b0691dee823941b0a2eb15efa7505643c0f796fc6af2b05e1550693d3abfae966c1455822d273053eae05d169e78849280"

RPROVIDES:${PN} += "gr-funcube"

RDEPENDS:${PN} += ""

inherit rpm
