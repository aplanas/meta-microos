SUMMARY = "Altera based arm64 systems"
DESCRIPTION = "Device Tree files for Altera based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-altera-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "f5433a01fc1386089133503ccfc6f37e5e7c449c7bc6b816727e51adf50e169578112fbad57716f5a8c6cbca03d2ea9035998648cf55f145aac2d67749d68917"

RPROVIDES:${PN} += "dtb-altera \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
