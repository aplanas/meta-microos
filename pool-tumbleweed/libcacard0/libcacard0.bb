SUMMARY = "Common Access Card (CAC) emulation"
DESCRIPTION = "This emulator is designed to provide emulation of actual smart cards to a \
virtual card reader running in a guest virtual machine. The emulated smart \
cards can be representations of real smart cards, where the necessary functions \
such as signing, card removal/insertion, etc. are mapped to real, physical \
cards which are shared with the client machine the emulator is running on, or \
the cards could be pure software constructs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.8.1"

RPM_NAME = "libcacard0-2.8.1-1.7.aarch64.rpm"
RPM_HASH = "9192e10fdac24ee4dcf0f216cbe827ce241c8d34da6a4fa4bef821b6233967cfe0e0a6a1301e8061c8e920bdebc688ab420f53e6290cfe63799db28fcfaa0e98"

RPROVIDES:${PN} += "libcacard.so.0()(64bit) \
libcacard0 \
libcacard0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnss3.so(NSS_3.12)(64bit) \
libnss3.so(NSS_3.12.5)(64bit) \
libnss3.so(NSS_3.2)(64bit) \
libnss3.so(NSS_3.3)(64bit) \
libnss3.so(NSS_3.4)(64bit) \
libnss3.so(NSS_3.5)(64bit) \
libnss3.so(NSS_3.8)(64bit) \
libnss3.so(NSS_3.9.2)(64bit) \
libnss3.so(NSS_3.9.3)(64bit)"

inherit rpm
