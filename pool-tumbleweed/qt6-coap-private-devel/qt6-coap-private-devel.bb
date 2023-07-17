SUMMARY = "Non-ABI stable API for the Qt 6 CoAP library"
DESCRIPTION = "This package provides private headers of libQt6Coap that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-coap-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "e99ebb84c7efccb77b4b218005de0bdb9f5db6620cb30f007cda2c0f75804543c7e39a716e634bca66ad905955dc6646ccb7a2e9915c41b34797a31a54916d66"

RPROVIDES:${PN} += "qt6-coap-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Coap \
cmake-Qt6Network \
qt6-core-private-devel"

inherit rpm
