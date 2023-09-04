SUMMARY = "Kernel rpm scriptlets"
DESCRIPTION = "Scripts called by the SUSE kernel packages on installation"
LICENSE = "GPL-2.0-or-later"

PV = "16.0.33"

RPM_NAME = "suse-module-tools-scriptlets-16.0.33-1.1.aarch64.rpm"
RPM_HASH = "1798e05cf0afa740bee24217cda7db4e25a37144cc055cf1c007fd419d7f989916497c1984913532213165de75bc41efc2a41f24e547b3bbd1b9dc241279a4fc"

RPROVIDES:${PN} += "suse-kernel-rpm-scriptlets \
suse-module-tools-/usr/lib/module-init-tools/kernel-scriptlets \
suse-module-tools-scriptlets"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
suse-module-tools"

inherit rpm
