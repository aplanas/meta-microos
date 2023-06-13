SUMMARY = "Library for PCSC driver for Towitoko Smart Card Readers"
DESCRIPTION = "This package contains a driver for Towitoko Chipdrive Micro, Extern, \
Extern II, Intern, and Twin and Kartenzwerg smart card readers. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package. \
 \
Please note, that many modern Towitoko readers are supported by the \
openct package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.8"

RPM_NAME = "libtowitoko2-2.0.8-1.2.aarch64.rpm"
RPM_HASH = "addd321aa2e2a5e33ff1b85426d6002be0d5b7a4d1dc69b20644e9de2b59367774d87e78d2f6b95891ebe44e1b4496cb585bd066a2f8b80d08ccb4c4ec053ed4"

RPROVIDES:${PN} += "libtowitoko.so.2()(64bit) \
libtowitoko2 \
libtowitoko2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
