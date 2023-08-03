SUMMARY = "The GNU Compiler Collection targeting m68k"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting m68k. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-m68k-gcc13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "6fcb5f8b4d97799aaf77db607c68ba779af3a719fba24175a0971dc96e27dc87bcf32b9953d08d6532b06fffdf84900baf08ac71049a2e71d1bc15494ff15217"

RPROVIDES:${PN} += "cross-m68k-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-m68k-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
