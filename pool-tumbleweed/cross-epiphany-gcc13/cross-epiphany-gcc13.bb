SUMMARY = "The GNU Compiler Collection targeting epiphany"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting epiphany."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-epiphany-gcc13-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "94371da940e2e455b0ff86d39866162bff42769cd386f567556cf3a845e3c601cfa9daa71354697ef3384bf2465e728bc12bab45921233bc47c539c3129186ea"

RPROVIDES:${PN} += "cross-epiphany-gcc13 \
epiphany-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-epiphany-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
