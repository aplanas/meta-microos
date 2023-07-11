SUMMARY = "Samsung Galaxy S Device Firmware Flasher"
DESCRIPTION = "Heimdall is a tool suite used to flash firmware (aka ROMs) onto \
Samsung Galaxy S devices. \
 \
This package contains a graphical user interface for Heimdall."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "heimdall-frontend-1.4.2-1.29.aarch64.rpm"
RPM_HASH = "72751848be909d372ac3bd92c19ae856b6238a9b05434728cb578121528b392e69265c19ebef38bc9c4658431ef8571b57fd788ba0515a20e934979224f38b2d"

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
