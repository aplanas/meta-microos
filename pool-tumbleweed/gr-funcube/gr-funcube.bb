SUMMARY = "FCD and FCDpro Plus Linux addon for gnuradio"
DESCRIPTION = "gr-funcube is an linux oot-module for gnuradio to implement a FUNcube \
Dongle and a FUNcube Dongle PRO+ source. It autodetects the correct \
soundcard from /proc/asound/cards. This idea was taken from the osmosdr \
 drivers. To control the device, the hidraw code of the HID API is used."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "gr-funcube-3.10.0.rc3-1.1.aarch64.rpm"
RPM_HASH = "03625adf9c53529d2b98497bbedbcc3020463ff8f9edda28e76bc4e1527f6d72b799d4c76be2df560d8ffb55b44e96539994c772d2cf27791255ef4deffca090"

RPROVIDES:${PN} += "gr-funcube"

RDEPENDS:${PN} += ""

inherit rpm
