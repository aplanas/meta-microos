SUMMARY = "FCD and FCDpro Plus Linux addon for gnuradio"
DESCRIPTION = "gr-funcube is an linux oot-module for gnuradio to implement a FUNcube \
Dongle and a FUNcube Dongle PRO+ source. It autodetects the correct \
soundcard from /proc/asound/cards. This idea was taken from the osmosdr \
 drivers. To control the device, the hidraw code of the HID API is used."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "gr-funcube-3.10.0.rc3-1.3.aarch64.rpm"
RPM_HASH = "3a30398634ce30f38ca6192af6328e816cb0400cb0b9c0d025129b6f79d1265e8fb5de3918f5839341138d1208a25edeeafd8e52a79e89ca41ff3015428bc02b"

RPROVIDES:${PN} += "gr-funcube"

RDEPENDS:${PN} += ""

inherit rpm
