SUMMARY = "Non-ABI stable API for the Qt 6 Mqtt library"
DESCRIPTION = "This package provides private headers of libQt6Mqtt that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-mqtt-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a45c3f1f6305a9977b1313bf5d11ad806134d4be3695f560a8762b068a926904b2d5be71a2b22eba2b6d58770b93e11d27c66fd64bd909eca08639ee48aa2ef8"

RPROVIDES:${PN} += "qt6-mqtt-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Mqtt"

inherit rpm
