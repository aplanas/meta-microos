SUMMARY = "The GNU Compiler Collection targeting m68k"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting m68k. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-m68k-gcc13-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "3f14f64a3d4ca2a15197052b01d78cffc83e95807d2aa2d6b7a033682e3ec56fafacda1149bba07e81aeab05f03ada46b3ae2f3c5d278b8875eb5fd4967c3a8a"

RPROVIDES:${PN} += "cross-m68k-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-m68k-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
