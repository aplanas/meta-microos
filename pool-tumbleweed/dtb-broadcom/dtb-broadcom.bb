SUMMARY = "Broadcom based arm64 systems"
DESCRIPTION = "Device Tree files for Broadcom based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-broadcom-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "12dd34dec299b8e08f2ec2ead903286b2bd4d8e0b0dbc2cdd30397c3d922279c3530bf3d6e6f8fcda6f0ee87b300079a4f6c6db8f9795ac5ac0ef93c0c2f6d88"

RPROVIDES:${PN} += "dtb-broadcom \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
