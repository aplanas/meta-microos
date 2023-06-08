SUMMARY = "The GNU Compiler Collection targeting epiphany"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting epiphany."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-epiphany-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "ff40c6fb7a9255f3f18866cea17382c14c5e89cafc98509f998f836778bce83853e96e877924ca0f3a999afc02bd78023224e50c09692efc4789b7df60cd84c2"

RPROVIDES:${PN} += "cross-epiphany-gcc11 cross-epiphany-gcc11(aarch-64) epiphany-elf-gcc"
RDEPENDS:${PN} += "/bin/sh cross-epiphany-binutils libstdc++6-devel-gcc11 update-alternatives"

inherit rpm
