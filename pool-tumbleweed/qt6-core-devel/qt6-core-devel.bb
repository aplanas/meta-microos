SUMMARY = "Development files for the Qt 6 Core library"
DESCRIPTION = "Development files for the Qt 6 Core library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-core-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "496d10ad3e75a415b80a74d019f5aff1db34bb6d377749df3f16b366f7d3d6ac7e4919cb4ba6ba0e7a463ac4f452a169a34bf957e194df62635455c7dd4a6e33"

RPROVIDES:${PN} += "cmake(Qt6Core) \
cmake(Qt6CoreTools) \
pkgconfig(Qt6Core) \
qt6-core-devel \
qt6-core-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6Core6 \
pkgconfig(Qt6Platform) \
qt6-base-common-devel"

inherit rpm
