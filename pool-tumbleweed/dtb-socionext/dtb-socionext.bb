SUMMARY = "Socionext based arm64 systems"
DESCRIPTION = "Device Tree files for Socionext based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-socionext-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "1e60774f73d1463f87da15a937b6d4e7aaedd38c8c4bc3eae3e17990ef49ef3e65e37526613a6d875d01b3e090279cabe45dcbb10c894472a68aa40a887fa984"

RPROVIDES:${PN} += "dtb-socionext \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
