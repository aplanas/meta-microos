SUMMARY = "Oxygen sounds"
DESCRIPTION = "This package contains the default sound set for a KDE Plasma workspace."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "oxygen5-sounds-5.27.7-1.1.noarch.rpm"
RPM_HASH = "8681a716790d2d8b9bf35459cad0f3991306d12963c6fb67c44da1d1a2f8253dd4c1c2976537c2d97532db5984fab6f041dee837ee8d3508e35cbeb38f917f5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-sounds5 \
oxygen5-sounds"

RDEPENDS:${PN} += ""

inherit rpm
