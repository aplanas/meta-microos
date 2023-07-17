SUMMARY = "Socionext based arm64 systems"
DESCRIPTION = "Device Tree files for Socionext based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-socionext-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "4f4b467d25583558b43d5e513e07725fb77dda31954eace3b086bc00fde3d9441b1fe21d46c23d59fe7869ac61abcc733a1c765fbc9aeb850bbdf21e2db441d0"

RPROVIDES:${PN} += "dtb-socionext \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
