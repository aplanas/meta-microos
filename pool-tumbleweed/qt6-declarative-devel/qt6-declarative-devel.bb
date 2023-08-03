SUMMARY = "Qt 6 Declarative meta package"
DESCRIPTION = "This meta-package requires all the qt6-declarative development packages."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-declarative-devel-6.5.2-1.1.noarch.rpm"
RPM_HASH = "524fa835c59771df490237671f1e056c60a6938bcb98b67a6c9c1cadc4ba87a07f040452dcc01af73eb7c620bba7b3a66e37bba2cc1fbb0d5e1264707b521c24"
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
