SUMMARY = "Qt 6 Declarative meta package"
DESCRIPTION = "This meta-package requires all the qt6-declarative development packages."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-declarative-devel-6.5.1-3.1.noarch.rpm"
RPM_HASH = "2e13944976da7e05c6fedbc26684cb4ea695e997f8cfc8f59b1439e4e3a16e718866c34439001a9bd8b765987883cc388d2e18ab983331731e1af51d4b52ac3a"
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
