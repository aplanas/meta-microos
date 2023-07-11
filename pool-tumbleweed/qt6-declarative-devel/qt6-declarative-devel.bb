SUMMARY = "Qt 6 Declarative meta package"
DESCRIPTION = "This meta-package requires all the qt6-declarative development packages."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-declarative-devel-6.5.1-1.3.noarch.rpm"
RPM_HASH = "1f04966ce34c364571adca1de9810ece26533f0b18b76e39c270d48c613a512812105c761044d0f796e0e5b155e339be65a5e9488c29b7576a07d8b7f28b93d8"
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
