SUMMARY = "Oxygen sounds"
DESCRIPTION = "This package contains the default sound set for a KDE Plasma workspace."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "oxygen5-sounds-5.27.6-1.1.noarch.rpm"
RPM_HASH = "bab3ce434f19937acebde62945b79c22b94bc8d7c65ae3758cca0db069a586b88bb84bd3d24da7a8e8c778494ef52ee490e845eeefab44cf8a38c06e882e2809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-sounds5 \
oxygen5-sounds"

RDEPENDS:${PN} += ""

inherit rpm
