SUMMARY = "The x template library"
DESCRIPTION = "Basic tools (containers, algorithms) used by other quantstack packages."
LICENSE = "BSD-3-Clause"

PV = "0.7.5"

RPM_NAME = "xtl-devel-0.7.5-1.2.noarch.rpm"
RPM_HASH = "8fdfe307e915b383fa6ef48e8dd123e4f496fa22c49bfb4f8d94534501d0293979c33a6235a6a0dbbfa2dae89d3d1106a5510cdc54018b4aa9dcb5a6474e1927"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake(xtl) \
pkgconfig(xtl) \
xtl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(nlohmann_json)"

inherit rpm
