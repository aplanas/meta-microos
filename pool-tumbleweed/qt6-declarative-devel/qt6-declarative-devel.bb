SUMMARY = "Qt 6 Declarative meta package"
DESCRIPTION = "This meta-package requires all the qt6-declarative development packages."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-declarative-devel-6.5.2-2.1.noarch.rpm"
RPM_HASH = "d783c7eda598404d3b08efb33b0ca3b86e2a7d522643a634406ce1846995f213a3e64f70324889c0b95bba4afb591181d3722b00e24e141640d24799cc699d98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-declarative-devel"

RDEPENDS:${PN} += "cmake-Qt6Qml \
cmake-Qt6QmlCore \
cmake-Qt6QmlLocalStorage \
cmake-Qt6QmlModels \
cmake-Qt6QmlWorkerScript \
cmake-Qt6Quick \
cmake-Qt6QuickControls2 \
cmake-Qt6QuickControls2Impl \
cmake-Qt6QuickDialogs2 \
cmake-Qt6QuickDialogs2QuickImpl \
cmake-Qt6QuickDialogs2Utils \
cmake-Qt6QuickLayouts \
cmake-Qt6QuickTemplates2 \
cmake-Qt6QuickTest \
cmake-Qt6QuickWidgets"

inherit rpm
