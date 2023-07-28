SUMMARY = "OPAL firmware (aka skiboot), used in booting OpenPOWER systems"
DESCRIPTION = "Provides OPAL (OpenPower Abstraction Layer) firmware, aka skiboot, as \
traditionally packaged with QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-skiboot-8.0.3-1.1.noarch.rpm"
RPM_HASH = "fa047ff4ece4e6e8ce9f4876146eedffb49ea1b47c5c5730bfef1a43266beaa35a165969e03026e4f5483e93f36a3f5f264df2b566bf6f04f8ad7e7f3bdad6b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-skiboot"

RDEPENDS:${PN} += "/usr/bin/sh \
update-alternatives"

inherit rpm
