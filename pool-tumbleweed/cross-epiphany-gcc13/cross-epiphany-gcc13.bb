SUMMARY = "The GNU Compiler Collection targeting epiphany"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting epiphany."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-epiphany-gcc13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "9a37f66e0100073b5bbc0ff2879fb4cb8fa21b32afbbc6581a7421b0154b6267f99907975ac418ed16deaaffbcb9c797384c674a4807e169135ce19d069d10e6"

RPROVIDES:${PN} += "cross-epiphany-gcc13 \
epiphany-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-epiphany-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
