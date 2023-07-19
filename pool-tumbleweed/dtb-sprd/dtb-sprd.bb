SUMMARY = "Spreadtrum based arm64 systems"
DESCRIPTION = "Device Tree files for Spreadtrum based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-sprd-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "e75ad2533aeb8f33ba8f0958442959899147020dcf50700cb8c4cc33bcf2f24a5ff2d7017b656442cec23affe2865d64dfcabffa8bfd0011446ed7d1e95c27e2"

RPROVIDES:${PN} += "dtb-sprd \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
