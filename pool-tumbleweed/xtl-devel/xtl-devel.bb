SUMMARY = "The x template library"
DESCRIPTION = "Basic tools (containers, algorithms) used by other quantstack packages."
LICENSE = "BSD-3-Clause"

PV = "0.7.5"

RPM_NAME = "xtl-devel-0.7.5-1.3.noarch.rpm"
RPM_HASH = "9ff46e78e21c8ded73b3bfc3372a770e7584623804a38c58599d51ec8e0661f0c18bf375a3dccfff25027ca67793c0dda380cc605349a2da1436ae47e0b127ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-xtl \
pkgconfig-xtl \
xtl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-nlohmann-json"

inherit rpm
