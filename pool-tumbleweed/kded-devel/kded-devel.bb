SUMMARY = "Central daemon of KDE workspaces: Build Environment"
DESCRIPTION = "KDED runs in the background and performs a number of small tasks. \
Some of these tasks are built in, others are started on demand. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kded-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "8a3f9a06b1867b061b5cd16b357a35ec96717caa21df5a22b824b52b2e2c0476d28d0938407b9b7b084aa9a849e2738e00cc0d3d373c7fa79ebbaeababc23eec"

RPROVIDES:${PN} += "cmake-KDED \
kded-devel"

RDEPENDS:${PN} += "extra-cmake-modules \
kded"

inherit rpm
