SUMMARY = "Non-ABI stable API for the Qt 6 QmlWorkerScript library"
DESCRIPTION = "This package provides private headers of libQt6QmlWorkerScript that do not have \
any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-qmlworkerscript-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "28a603b8318a2fe64f2a590e5a6172f29a1e55e8b5e90913e375756a0f7d096e9220ab75a884647ef6de0facd458c35230bb9353c1c86f4c2ca5bd4bfc436e17"

RPROVIDES:${PN} += "qt6-qmlworkerscript-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlWorkerScript \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
