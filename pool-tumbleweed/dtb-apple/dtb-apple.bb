SUMMARY = "Apple SOC based arm64 systems"
DESCRIPTION = "Device Tree files for Apple SOC based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-apple-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "d7d62bdab84afeb6379845ba0a5b241296b837b16a92851a5ed2106cc68b176e73ebff39f9355c6de46273d13f136c47c869bf3acbb552ba0e0fe480c0d2dcb0"

RPROVIDES:${PN} += "dtb-apple \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
