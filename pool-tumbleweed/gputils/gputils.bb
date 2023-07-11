SUMMARY = "Development utilities for Microchip PIC microcontrollers"
DESCRIPTION = "This is a collection of development tools for Microchip PIC \
microcontrollers. \
 \
Gputils implements a subset of features available with Microchip's tools. \
See the documentation for an up-to-date list of what gputils can do."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.2"

RPM_NAME = "gputils-1.5.2-1.5.aarch64.rpm"
RPM_HASH = "62a48b17bc7b714f52113c04972c38febd894c00e36e97dd15c095829a6e1813b7f58df6dafe80d4e0e9c6dc6af5e9ce16724dc08c0aead819d4a703a844e5f9"

RPROVIDES:${PN} += "gputils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
