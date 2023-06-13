SUMMARY = "Non-ABI stable API for the Qt 6 Charts Library"
DESCRIPTION = "This package provides private headers of libQt6Charts that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-charts-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "ae51c06e31e4784965685b613b258c12b1d067efcd40fd1cff4d415c9f63546c54a85984188f919a90ad37c663c9d35b5c20476f4bb6e7b03b80f7ed8d4a1765"

RPROVIDES:${PN} += "qt6-charts-private-devel \
qt6-charts-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6Charts)"

inherit rpm
