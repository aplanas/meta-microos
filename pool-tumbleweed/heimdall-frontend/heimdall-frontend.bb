SUMMARY = "Samsung Galaxy S Device Firmware Flasher"
DESCRIPTION = "Heimdall is a tool suite used to flash firmware (aka ROMs) onto \
Samsung Galaxy S devices. \
 \
This package contains a graphical user interface for Heimdall."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "heimdall-frontend-1.4.2-1.28.aarch64.rpm"
RPM_HASH = "5ed563ee864593a019bdbb78022b6cb0977d8f936f3eb5c4d0af21be9b8ba36151fb0e6717841509f1f5821d7f6ef347ba9f00f005f4d10b818ae1018fa7bc8a"

RPROVIDES:${PN} += "heimdall-frontend"

RDEPENDS:${PN} += "heimdall \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
