SUMMARY = "Kernel rpm scriptlets"
DESCRIPTION = "Scripts called by the SUSE kernel packages on installation"
LICENSE = "GPL-2.0-or-later"

PV = "16.0.30"

RPM_NAME = "suse-module-tools-scriptlets-16.0.30-1.1.aarch64.rpm"
RPM_HASH = "c5b8abf960b0ef538803043c4dd12614a1c3acebb45ffa025536b1c8c062a6e74527cbe9c3242791a363ef62aaa7373885dfb264089ea95eca4dba3069625e40"

RPROVIDES:${PN} += "suse-kernel-rpm-scriptlets \
suse-module-tools-/usr/lib/module-init-tools/kernel-scriptlets \
suse-module-tools-scriptlets"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
suse-module-tools"

inherit rpm
