SUMMARY = "Development files for the FCD and FCDpro Plus addon"
DESCRIPTION = "gr-funcube is an linux oot-module for gnuradio to implement a FUNcube \
Dongle and a FUNcube Dongle PRO+ source. It autodetects the correct \
soundcard from /proc/asound/cards. This idea was taken from the osmosdr \
 drivers. To control the device, the hidraw code of the HID API is used."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "libgnuradio-funcube-devel-3.10.0.rc3-1.3.aarch64.rpm"
RPM_HASH = "9e3c77826e8f1efa6c69f0f1e347430573e64ca71fb8292a19de88247023b8691f625e28c0dcabd8b75e7a355f2acc73d115a4c94d677417884ae0f667b38e65"

RPROVIDES:${PN} += "cmake-funcube \
cmake-gnuradio-funcube \
libgnuradio-funcube-devel"

RDEPENDS:${PN} += "libgnuradio-funcube3-10-0"

inherit rpm
