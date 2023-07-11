SUMMARY = "Kwin integration for LeechCraft"
DESCRIPTION = "This package allows to start Leechcraft as a Desktop Environment with \
the KDE Window Manager."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-fenet-kwin-0.6.70+git.14794.g33744ae6ce-3.2.noarch.rpm"
RPM_HASH = "2c73c261646f8f6bb2442ebfc1b716645e99ddb495254e019bb152ca2513d6d0e6d9dd8dbff63b083f925ec53854fcbca0c0b197122a52991792ae50628c1e1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "leechcraft-fenet-kwin \
leechcraft-fenet-wm"

RDEPENDS:${PN} += "/usr/bin/sh \
kwin5 \
leechcraft-fenet"

inherit rpm
