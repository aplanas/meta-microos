SUMMARY = "Non-ABI stable API for the Qt 6 ShaderTools library"
DESCRIPTION = "This package provides private headers of libQt6ShaderTools that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-shadertools-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "656feb8183513b941ad041e649488856b371d880b722b65cd1905c2ff562ad6347353b0cffae4476d6c224e04083f20cd074aa7035a535604910f9298fc237a8"

RPROVIDES:${PN} += "qt6-shadertools-private-devel"

RDEPENDS:${PN} += "cmake-Qt6ShaderTools \
qt6-gui-private-devel"

inherit rpm
