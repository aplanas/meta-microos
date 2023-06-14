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

RPM_NAME = "pcsc-towitoko-2.0.8-1.2.aarch64.rpm"
RPM_HASH = "ef6e82280a18582ffe9df151a7222f71b343cc48697c2e8d62dd5f19170f78f611b1d5af37bebb1a45c953b783303dd023cb8cb4a7c64872734aa7622b5954c3"

RPROVIDES:${PN} += "pcsc-towitoko"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtowitoko.so.2 \
pcsc-lite"

inherit rpm
