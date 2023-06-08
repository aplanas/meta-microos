SUMMARY = "Nvidia based arm64 systems"
DESCRIPTION = "Device Tree files for Nvidia based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-nvidia-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "0057804f607a9a63a2e69c2b26fc05246c4a120cb383d864f2ff2e4cdd6be96e6aae4cc9e8228fb3bc4e302683e33dc70e9ff75f36d225b2df145fcce6ff101c"

RPROVIDES:${PN} += "dtb-nvidia dtb-nvidia(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
