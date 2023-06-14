SUMMARY = "Non-ABI stable API for the Qt 6 SpatialAudio Library"
DESCRIPTION = "This package provides private headers of libQt6SpatialAudio that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-spatialaudio-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c0b3eef5d389d7230bad8f69e4e7689084600fca50a3756fd95d91f83d0094a18a97a86619d15fe5106fa424160cd7b2a70870bb89eb4f354b90ec33a0ba89f1"

RPROVIDES:${PN} += "qt6-spatialaudio-private-devel"

RDEPENDS:${PN} += "cmake-Qt6SpatialAudio"

inherit rpm
