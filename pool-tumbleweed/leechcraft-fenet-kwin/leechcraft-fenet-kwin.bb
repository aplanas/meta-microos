SUMMARY = "Kwin integration for LeechCraft"
DESCRIPTION = "This package allows to start Leechcraft as a Desktop Environment with \
the KDE Window Manager."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-fenet-kwin-0.6.70+git.14794.g33744ae6ce-3.1.noarch.rpm"
RPM_HASH = "b3ad4f707e3103c50d8bf1a02b6c50a82f67f906f99d3a9716f058431cc9b78928c40239bcd3fee66b2af255dfc56e3930acb8f47b86d47b0faaa975d425f300"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "leechcraft-fenet-kwin \
leechcraft-fenet-wm"

RDEPENDS:${PN} += "/bin/sh \
kwin5 \
leechcraft-fenet"

inherit rpm
