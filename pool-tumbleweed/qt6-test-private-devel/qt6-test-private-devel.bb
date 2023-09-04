SUMMARY = "Non-ABI stable API for the Qt 6 Test library"
DESCRIPTION = "This package provides private headers of libQt6Test that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-test-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "953de984e9fd6958b080d420e2ccaf86ed2732786192d1f476072858f04079f91fea4cb424507e10fd6ead74d7de4249cd80b39c79c640381ee2af7276e80b24"

RPROVIDES:${PN} += "qt6-test-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Test \
qt6-core-private-devel"

inherit rpm
