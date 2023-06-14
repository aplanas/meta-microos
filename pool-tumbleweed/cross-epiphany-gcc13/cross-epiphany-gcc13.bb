SUMMARY = "The GNU Compiler Collection targeting epiphany"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting epiphany."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-epiphany-gcc13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "38b12a631f4a1bbd86385e976b138298b6415ef93769bcad4b43265c33148f207b9e905db973f07fe83bbd1d74f11591f24f0252e6d6bef225b1ea31c520233d"

RPROVIDES:${PN} += "cross-epiphany-gcc13 \
epiphany-elf-gcc"

RDEPENDS:${PN} += "/bin/sh \
cross-epiphany-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
