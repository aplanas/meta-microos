SUMMARY = "Altera based arm64 systems"
DESCRIPTION = "Device Tree files for Altera based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-altera-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "ed55dbfec55864320e7f3af82aef79e26a3e9b123aad37e781cbce538b1049d21ce91b0e4f39a1de664dd68275b1e810bd37575a77aa1d1ad06e65f88f0d2723"

RPROVIDES:${PN} += "dtb-altera \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
