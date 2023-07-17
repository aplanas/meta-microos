SUMMARY = "Non-ABI stable API for the Qt 6 Charts Library"
DESCRIPTION = "This package provides private headers of libQt6Charts that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-charts-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "84541724883b83a9093dbda29a5dcdb01b5868dc74e4566b216398c41cf8c84cd4d18504d9d91fcb5c914d1b8004f8b7b02e43b4cb02c63ad925175c081c2f78"

RPROVIDES:${PN} += "qt6-charts-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Charts"

inherit rpm
