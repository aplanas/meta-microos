SUMMARY = "AMD based arm64 systems"
DESCRIPTION = "Device Tree files for AMD based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-amd-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "5760ca14c9102241bdffff8a55ee98bd6f45c6555e75cdbd97daa3521d7c6493557f6447ab6d655347892069f746ae45e8d0494c0f242a82248fb414e36877a0"

RPROVIDES:${PN} += "dtb-amd \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
