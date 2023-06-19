SUMMARY = "Non-ABI stable API for the Qt 6 Mqtt library"
DESCRIPTION = "This package provides private headers of libQt6Mqtt that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-mqtt-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "123101871f5dbbe313aa088d6f6f502fe484f31afbcb481092ecce45f0ad2678179f47dcf8ab4abc5e37597c5e6b1d4a3d9e89460cf296486eee8933465aaaeb"

RPROVIDES:${PN} += "qt6-mqtt-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Mqtt"

inherit rpm
