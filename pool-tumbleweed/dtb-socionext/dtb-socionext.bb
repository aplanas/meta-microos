SUMMARY = "Socionext based arm64 systems"
DESCRIPTION = "Device Tree files for Socionext based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-socionext-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "636b383227d76325282e360f1a9848317bbc3e31badb795d810c067e211c686123fb36493cd69b749a8d8652d10fc1c4410c8f2f923f3933f9ab53e99f28abff"

RPROVIDES:${PN} += "dtb-socionext \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
