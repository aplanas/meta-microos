SUMMARY = "AMD based arm64 systems"
DESCRIPTION = "Device Tree files for AMD based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-amd-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "e2d49594c0b4889e0ed12f0d3d5bc95afb7471a9f794bfefcb984a941f0b81ef8bbb13eba3c79469543f9c8aa1539387d052e0e06384f96b7d659fa613f3f6fc"

RPROVIDES:${PN} += "dtb-amd \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
