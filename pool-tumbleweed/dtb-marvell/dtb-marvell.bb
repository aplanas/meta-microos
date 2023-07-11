SUMMARY = "Marvell based arm64 systems"
DESCRIPTION = "Device Tree files for Marvell based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-marvell-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "f5f2127c13b23895bb9c49902070b68630431a36835bb0c04b85d20f837f17c857c0e8d062eabd52862d55be58f6b24a36a947c0d29bd31a6ee5765315cbc127"

RPROVIDES:${PN} += "dtb-marvell \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
