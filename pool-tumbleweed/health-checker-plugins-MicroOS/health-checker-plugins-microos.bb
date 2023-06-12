SUMMARY = "Health-checker plugins for openSUSE MicroOS"
DESCRIPTION = "This package contains health-checker plugins for testing that \
the openSUSE MicroOS did boot correctly."
LICENSE = "GPL-2.0-only"

PV = "1.8"

RPM_NAME = "health-checker-plugins-MicroOS-1.8-1.1.noarch.rpm"
RPM_HASH = "6d0f274538a004490d7508055d8cd6f15e494f4f3ff5d927d7071b7855f152d740ea60fa03c88a4508754d92065443e4812a3aaf32f0e647b6ec59320ae99090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "health-checker-plugins \
health-checker-plugins-MicroOS"
RDEPENDS:${PN} += "/bin/bash \
health-checker"

inherit rpm
