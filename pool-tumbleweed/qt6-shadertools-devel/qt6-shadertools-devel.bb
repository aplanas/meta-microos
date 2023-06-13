SUMMARY = "Qt 6 ShaderTools library - Development files"
DESCRIPTION = "Development files for the Qt 6 ShaderTools library"
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-shadertools-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "731a05f852fa947934c2fc7f5a9524d008955969c676a255d817c200d62fcfdd8ec7e415b7ec71d209482384aeb81a9a7838bc4bdd426bb477e769bd511d80e3"

RPROVIDES:${PN} += "cmake(Qt6ShaderTools) \
cmake(Qt6ShaderToolsTools) \
pkgconfig(Qt6ShaderTools) \
qt6-shadertools-devel \
qt6-shadertools-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Gui) \
libQt6ShaderTools6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
qt6-shadertools"

inherit rpm
