SUMMARY = "Socionext based arm64 systems"
DESCRIPTION = "Device Tree files for Socionext based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-socionext-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "344d520f367828e68101f459df270283c8332b4e69509af8eead802f65ce9d9dd684e622f492c8a43d4488e9d15b61dba159b3a1589a4c3c86a1642b9f51aec4"

RPROVIDES:${PN} += "dtb-socionext \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
