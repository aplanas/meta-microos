SUMMARY = "Apple SOC based arm64 systems"
DESCRIPTION = "Device Tree files for Apple SOC based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-apple-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "bb53126a725c4b47327f4f24b809e5b356c0eeb4e218981a16bf404ae5dc268b06f77ce95f79cae44292e77e7e806347ae0fdca46af5b25170fed04030ecc5ff"

RPROVIDES:${PN} += "dtb-apple \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
