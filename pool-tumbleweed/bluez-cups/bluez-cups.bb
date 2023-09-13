SUMMARY = "CUPS Driver for Bluetooth Printers"
DESCRIPTION = "Contains the files required by CUPS for printing to Bluetooth-connected \
printers."
LICENSE = "GPL-2.0-or-later"

PV = "5.69"

RPM_NAME = "bluez-cups-5.69-1.1.aarch64.rpm"
RPM_HASH = "08a940285fa43b203d5d50a10a3e59fb6b5aa2879c2a5aa13ed4a25367a82995b0f0a2235f254e97ee2c0dc1e5cfb8bb11377daf9bf17c4af047f9dd77a7c63f"

RPROVIDES:${PN} += "bluez-cups"

RDEPENDS:${PN} += "bluez \
cups \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0"

inherit rpm
