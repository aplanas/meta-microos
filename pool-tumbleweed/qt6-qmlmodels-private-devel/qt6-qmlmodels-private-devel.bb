SUMMARY = "Non-ABI stable API for the Qt 6 QmlModels library"
DESCRIPTION = "This package provides private headers of libQt6QmlModels that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlmodels-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "2d90f1a8a6577e723a4eeceb6f0b80da34933a3f9900e3e222502c955d6ad4ab82fc91143b38d2a1ba2500c25015a8bc802bbccc281f76d485e782412db64339"

RPROVIDES:${PN} += "qt6-qmlmodels-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlModels \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
