SUMMARY = "Socionext based arm64 systems"
DESCRIPTION = "Device Tree files for Socionext based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-socionext-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "f315f4a2000a9b04e5fde09658c93be2159da4371af8d29e5eb44e7f7941871cf840f37f70389b1d5828f4c219ac4c5d603b011605595282127d6930cc0b3152"

RPROVIDES:${PN} += "dtb-socionext dtb-socionext(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
