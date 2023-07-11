SUMMARY = "PC/SC IFD Handler for the Reiner SCT Cyberjack USB-SmartCard Readers"
DESCRIPTION = "This package includes the PC/SC IFD handler for the Reiner SCT \
Cyberjack pinpad/e-com/RFID USB chipcard readers. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.99.5final.SP15"

RPM_NAME = "pcsc-cyberjack-3.99.5final.SP15-1.5.aarch64.rpm"
RPM_HASH = "2b36420d70452cc7fa9534d46bb9f7e1e1c00d8575a208dff2e92ba922ebccb760b1473d0d56444aa0f6c5b2e3e5a7111a63b3492caf01869ebf714933f04c59"

RPROVIDES:${PN} += "config-pcsc-cyberjack \
libifd-cyberjack.so.6 \
pcsc-cyberjack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0 \
pcsc-lite"

inherit rpm
