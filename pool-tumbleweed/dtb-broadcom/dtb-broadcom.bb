SUMMARY = "Broadcom based arm64 systems"
DESCRIPTION = "Device Tree files for Broadcom based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-broadcom-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "9bc3acd9ea9a2fc19d3fbcbbf726fcd3d7775a3c362324e6de8638ab1c8219d317ee4b971ea44e86edb39e4dd7ff655a2ddff6b900d3cbb377819cefbae03e93"

RPROVIDES:${PN} += "dtb-broadcom \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
