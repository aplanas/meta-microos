SUMMARY = "Common Access Card (CAC) emulation"
DESCRIPTION = "This emulator is designed to provide emulation of actual smart cards to a \
virtual card reader running in a guest virtual machine. The emulated smart \
cards can be representations of real smart cards, where the necessary functions \
such as signing, card removal/insertion, etc. are mapped to real, physical \
cards which are shared with the client machine the emulator is running on, or \
the cards could be pure software constructs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.8.1"

RPM_NAME = "libcacard0-2.8.1-1.8.aarch64.rpm"
RPM_HASH = "b4c3b72d8f9bf9c1f8606e1949037aace463a1828134e6e605fb2c2460c6bf15a803fbe7fe3780f1d1eba7af920197e5852099a88ae02ce45fd1795a62c579d7"

RPROVIDES:${PN} += "libcacard.so.0 \
libcacard0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libnspr4.so \
libnss3.so"

inherit rpm
