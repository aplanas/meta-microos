SUMMARY = "Central daemon of KDE workspaces: Build Environment"
DESCRIPTION = "KDED runs in the background and performs a number of small tasks. \
Some of these tasks are built in, others are started on demand. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kded-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "61c43778ad750fcb3888028111b62625b83ebbcd59b4d59d8f1c35d7201f4d63d1a992d943d4b0b8ad4e5964aadf505ede408963970c8346858e36846fb7d022"

RPROVIDES:${PN} += "cmake-KDED \
kded-devel"

RDEPENDS:${PN} += "extra-cmake-modules \
kded"

inherit rpm
