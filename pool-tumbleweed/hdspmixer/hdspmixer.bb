SUMMARY = "GUI tool to control advanced routing of RME Hammerfall DSP cards"
DESCRIPTION = "HDSPMixer is the Linux equivalent of the Totalmix application from RME. \
It is a tool to control the advanced routing features of the RME \
Hammerfall DSP soundcard series."
LICENSE = "GPL-2.0-or-later"

PV = "1.11"

RPM_NAME = "hdspmixer-1.11-24.4.aarch64.rpm"
RPM_HASH = "465194086cd999cf34d0f5e8e65939ffc088844b6f7b03e7648f6a688e9d2d1ea84142372b359773e61de8115f467e5110e9ae5e18bc2a52755d56f9703211e6"

RPROVIDES:${PN} += "alsa-tools-gui-/usr/bin/hdspmixer \
hdspmixer"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libfltk.so.1.3 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
