SUMMARY = "Development files for libx86emu"
DESCRIPTION = "An x86 emulation library with focus on usage and \
execution logging functions. \
 \
This package contains the header files for the library API."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "libx86emu-devel-3.5-1.8.aarch64.rpm"
RPM_HASH = "81e79974c7950e358c452144528cdf154b009142ffda2df3bab2383e7a8bbab187fc206df34b9b064cbf193e86324f835cfdd791adfc89ac0660fa0d76fdd4d4"

RPROVIDES:${PN} += "libx86emu-devel \
libx86emu-devel(aarch-64)"
RDEPENDS:${PN} += "libx86emu3"

inherit rpm
