SUMMARY = "Kernel rpm scriptlets"
DESCRIPTION = "Scripts called by the SUSE kernel packages on installation"
LICENSE = "GPL-2.0-or-later"

PV = "16.0.35"

RPM_NAME = "suse-module-tools-scriptlets-16.0.35-1.1.aarch64.rpm"
RPM_HASH = "842a2d2d08ad3eb7caa1c9941facc7363e05111eab673d1d72f5e8da480886c49f6dac38d4f0a7832f4dd7cce73eb732958718b1787618de2cc1c9a161098b9f"

RPROVIDES:${PN} += "suse-kernel-rpm-scriptlets \
suse-module-tools-/usr/lib/module-init-tools/kernel-scriptlets \
suse-module-tools-scriptlets"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
suse-module-tools"

inherit rpm
