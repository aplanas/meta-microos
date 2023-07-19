SUMMARY = "Marvell based arm64 systems"
DESCRIPTION = "Device Tree files for Marvell based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-marvell-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "6823f937c94c79d304a04d3ff04c75ff1f8d676c71ee85f7eca855061bb30a9f388953749d33c6ac068754922b1547ea044657e5fb3da4b5e499b2d98b021068"

RPROVIDES:${PN} += "dtb-marvell \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
