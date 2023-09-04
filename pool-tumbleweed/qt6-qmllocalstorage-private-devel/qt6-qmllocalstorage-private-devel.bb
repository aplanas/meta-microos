SUMMARY = "Non-ABI stable API for the Qt 6 QmlLocalStorage library"
DESCRIPTION = "This package provides private headers of libQt6QmlLocalStorage that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-qmllocalstorage-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "be3848eca1d6c189f1c791dfefb7c013b23e15f6725a205b1a3e5e88d58b353faec09f295eeb236251b1e6dfad7e71e13115e7220410a69f665c295f4f2dfac4"

RPROVIDES:${PN} += "qt6-qmllocalstorage-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlLocalStorage \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
