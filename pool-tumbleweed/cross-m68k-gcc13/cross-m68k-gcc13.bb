SUMMARY = "The GNU Compiler Collection targeting m68k"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting m68k. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-m68k-gcc13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "2301a4ddcfe1027e200da7cc5080d1378cdbb64c0a7e0a8f31419bd67271b8f4a7acca44f68146e7f80f826affa00e65f76c9643e7d12d884e271adc796b17cb"

RPROVIDES:${PN} += "cross-m68k-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-m68k-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
