SUMMARY = "Non-ABI stable API for the Qt 6 Location Library"
DESCRIPTION = "This package provides private headers of libQt6Location that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-location-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "c446dcc666cddb46c39643d3de4520e7b75a0a02b8ba9186ab162de7b8a5eee986b7ebdf3e5fb588c73c2c503b6fe1d9ad2bc2cc56bf90a9cb36eb60bfdd86f9"

RPROVIDES:${PN} += "qt6-location-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Location"

inherit rpm
