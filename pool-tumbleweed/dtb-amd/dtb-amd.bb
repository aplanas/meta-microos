SUMMARY = "AMD based arm64 systems"
DESCRIPTION = "Device Tree files for AMD based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-amd-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "091926a08cc1135f49da6161d613008d99c3cdde6959dad86ae922bf7e1a1137d52442175990dda46d7a9c750cc4ae975d66c1aa8a2cfb5f6b6681d5ce1fcc17"

RPROVIDES:${PN} += "dtb-amd \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
