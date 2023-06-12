SUMMARY = "Non-ABI stable API for the Qt 6 LabsQmlModels library"
DESCRIPTION = "This package provides private headers of libQt6LabsQmlModels that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labsqmlmodels-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "6d39f08b0382275c6f9c43f981f47392cbadbbf0bce03cf81b98cc766fd220cf2ca1de4c38ff0448fc8c4404be8b07a2094c350e4923a96f308201372740b402"

RPROVIDES:${PN} += "qt6-labsqmlmodels-private-devel \
qt6-labsqmlmodels-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6LabsQmlModels)"

inherit rpm
