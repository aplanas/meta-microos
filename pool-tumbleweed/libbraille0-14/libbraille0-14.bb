SUMMARY = "Access to Braille Displays and Terminals"
DESCRIPTION = "Libbraille is a computer shared library which makes it possible to \
develop for Braille displays. It provides an API to \
write text on the display, directly draw dots, or get the value of \
keys pressed on the Braille keyboard."
LICENSE = "LGPL-2.1-only"

PV = "0.19.0"

RPM_NAME = "libbraille0-14-0.19.0-24.9.aarch64.rpm"
RPM_HASH = "f93373c0dd0deb1de0c9c1fedbc45e6de4ea9d7676fb979902f3c6088e5902f562d68544bb4ded28b1f8122f61f3cb7fc17bbf0fee8a3974fec37beae81a5139"

RPROVIDES:${PN} += "libbraille-0.so.14 \
libbraille0-14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-0.1.so.4"

inherit rpm
