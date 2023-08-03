SUMMARY = "OPAL firmware (aka skiboot), used in booting OpenPOWER systems"
DESCRIPTION = "Provides OPAL (OpenPower Abstraction Layer) firmware, aka skiboot, as \
traditionally packaged with QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-skiboot-8.0.3-2.1.noarch.rpm"
RPM_HASH = "10226753da3b20e5cbeb937d8af5834198cb316c61dea9c1814b0d9f94aeb64e4dee243800dc2108c927af855e7fbf434183278c958c5c63c848df01b1d80f00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-skiboot"

RDEPENDS:${PN} += "/usr/bin/sh \
update-alternatives"

inherit rpm
