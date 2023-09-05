SUMMARY = "Nvidia based arm64 systems"
DESCRIPTION = "Device Tree files for Nvidia based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-nvidia-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "ab6152a54f874f28dfcd71f012663aef49d5e911c8dfad3b1aa0f6ed1199551a0004e371b60f63ac05f55b5a7e9e418c248d818bb6d22f603a940ec1e4fc9e13"

RPROVIDES:${PN} += "dtb-nvidia \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
