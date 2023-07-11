SUMMARY = "OPAL firmware (aka skiboot), used in booting OpenPOWER systems"
DESCRIPTION = "Provides OPAL (OpenPower Abstraction Layer) firmware, aka skiboot, as \
traditionally packaged with QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-skiboot-8.0.2-2.1.noarch.rpm"
RPM_HASH = "40fe0e11149529c70ecca7a1ce794d43d3044a9bba450c5d1197f657466a462d85ada26861dd6d0e1e535180019051f1d827f786bbc5692faae07e6562cfb95f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-skiboot"

RDEPENDS:${PN} += "/usr/bin/sh \
update-alternatives"

inherit rpm
