SUMMARY = "Altera based arm64 systems"
DESCRIPTION = "Device Tree files for Altera based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-altera-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "86a61dbdffbc0ddbe44fe1a1c9b53e7a874bfd3c08055e1cd4572889b57c807a11725c6730225c8c9568ab1276841ef06c7a3b2bfd77c708c2f03aeac931a626"

RPROVIDES:${PN} += "dtb-altera \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
