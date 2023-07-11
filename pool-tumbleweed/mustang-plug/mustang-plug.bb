SUMMARY = "Software for Fender Mustang amps"
DESCRIPTION = "Graphical interface to control amplifier and effect stages \
of Fender Mustang guitar amplifiers."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.3"

RPM_NAME = "mustang-plug-1.4.3-2.2.aarch64.rpm"
RPM_HASH = "3b3b17cab2ebe0df26e5b9c64d358dcfc1725a724306b0fc5b1c9b5518cc2d79b3a68592ab6a5f2b8a53f15418ff1562b401ab3e694b4b8bb4e82d8e76b6a3cd"

RPROVIDES:${PN} += "mustang-plug"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
