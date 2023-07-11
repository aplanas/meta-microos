SUMMARY = "Kernel rpm scriptlets"
DESCRIPTION = "Scripts called by the SUSE kernel packages on installation"
LICENSE = "GPL-2.0-or-later"

PV = "16.0.32"

RPM_NAME = "suse-module-tools-scriptlets-16.0.32-1.1.aarch64.rpm"
RPM_HASH = "77b0e614c83aad21b9c746fc8f6257f4d239c363cfb2c39703068a42ce4044436fb217ee3372d8496da607385a8a7220f8fc32766a12d436ceaa5ea0b96a26a4"

RPROVIDES:${PN} += "suse-kernel-rpm-scriptlets \
suse-module-tools-/usr/lib/module-init-tools/kernel-scriptlets \
suse-module-tools-scriptlets"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
suse-module-tools"

inherit rpm
