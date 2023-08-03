SUMMARY = "Socionext based arm64 systems"
DESCRIPTION = "Device Tree files for Socionext based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-socionext-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "59c8276e4ccc96e364f3a716c0bc98b78c538a8c69b8e5f53909341c7afa50f67a57fb06a26dd44ce75ac997114db6aeef6c21f1114ddfed6e9793a0de555e00"

RPROVIDES:${PN} += "dtb-socionext \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
