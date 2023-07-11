SUMMARY = "GNU diff Utilities"
DESCRIPTION = "The GNU diff utilities find differences between files. diff is used to \
make source code patches, for instance."
LICENSE = "GFDL-1.2-only & GPL-3.0-or-later"

PV = "3.10"

RPM_NAME = "diffutils-3.10-1.2.aarch64.rpm"
RPM_HASH = "d5322f8efe03e8fe7fedfb6c2425c81fd8d3fa6f8ebb4f03b623206a08c512c4e2cc2102c3e046c88b4e709f27f0cd8c093a2265217f1209ccd09c9fd8a10550"

RPROVIDES:${PN} += "diff \
diffutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
