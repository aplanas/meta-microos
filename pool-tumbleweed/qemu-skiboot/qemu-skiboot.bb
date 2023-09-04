SUMMARY = "OPAL firmware (aka skiboot), used in booting OpenPOWER systems"
DESCRIPTION = "Provides OPAL (OpenPower Abstraction Layer) firmware, aka skiboot, as \
traditionally packaged with QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-skiboot-8.0.4-1.1.noarch.rpm"
RPM_HASH = "aa0dd87fd6b3e8b0c2199401e2f76b2c5e3ec42eca17e0059c4ac1f926b4439ea341e066662e62e44b7a94727c192c751b326141298987b667508903118d5fad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-skiboot"

RDEPENDS:${PN} += "/usr/bin/sh \
update-alternatives"

inherit rpm
