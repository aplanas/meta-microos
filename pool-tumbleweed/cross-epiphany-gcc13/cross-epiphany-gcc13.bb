SUMMARY = "The GNU Compiler Collection targeting epiphany"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting epiphany."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-epiphany-gcc13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "8d1be21fd30eef6f5cd6015c519790fbb5587a63ac49d9bf77f8fe37a3c64ce53670944da879dedc9c44d8eb97d496f2c1c5d691b0824b47d2f8b708d7bae81e"

RPROVIDES:${PN} += "cross-epiphany-gcc13 \
epiphany-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-epiphany-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
