SUMMARY = "The GNU Compiler Collection targeting epiphany"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting epiphany."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-epiphany-gcc13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "b95a79fc0b100af975c28ff0c2db9bd01e00c8e6cab61dcf5868e342d930a7307bb901c276bdf030cb4f57b5d40888ee7bfa24859d3d3a1995f7b9085fa0806a"

RPROVIDES:${PN} += "cross-epiphany-gcc13 \
epiphany-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-epiphany-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
