SUMMARY = "PCSC driver for Towitoko Smart Card Readers"
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

RPM_NAME = "pcsc-towitoko-devel-2.0.8-1.2.aarch64.rpm"
RPM_HASH = "63a08ca8ef99627d3c62f78a1d3d7a7361e320462666a4f2ef75e2620f755cf4bbf6eb4a197e5144167b9d28a9947a2fdadd1c1176c4d663765663812ec47eb1"

RPROVIDES:${PN} += "pcsc-towitoko-devel \
pcsc-towitoko-devel(aarch-64)"

RDEPENDS:${PN} += "libtowitoko2"

inherit rpm
