SUMMARY = "GUI control tool for RME Digi32 and RME Digi96 soundcards"
DESCRIPTION = "Rmedigicontrol is a control tool for RME Digi32 and RME Digi96 soundcards. \
It depends on ALSA and GTK+ and offers a graphical frontend for all your \
switches."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.5a"

RPM_NAME = "rmedigicontrol-0.3.5a-24.4.aarch64.rpm"
RPM_HASH = "0b817658fe415ce6f8bd5a1be888b6ecb227406165dfc37abc8e83db8f73035d8dc9d9eae71708794bec92a56fd2967f299f6deebec29897216a3e089acdc542"

RPROVIDES:${PN} += "alsa-tools-gui-/usr/bin/rmedigicontrol \
rmedigicontrol"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgtk-x11-2.0.so.0"

inherit rpm
