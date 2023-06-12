SUMMARY = "The GNU Compiler Collection targeting epiphany"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting epiphany."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-epiphany-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "0643b46b7379a6f91c3701c84218e1075df852678e9e42b4db38d6bdf57c84611d856176d325a8021beebf97c896178d070ba05096a063634f696caa73efe98a"

RPROVIDES:${PN} += "cross-epiphany-gcc12 \
cross-epiphany-gcc12(aarch-64) \
epiphany-elf-gcc"
RDEPENDS:${PN} += "/bin/sh \
cross-epiphany-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
