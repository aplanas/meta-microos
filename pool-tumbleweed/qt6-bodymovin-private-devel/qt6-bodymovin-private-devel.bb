SUMMARY = "Development files for the Qt 6 Bodymovin library"
DESCRIPTION = "This package provides private headers of libQt6Bodymovin that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-bodymovin-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "dcb4aed7f2890e2229633c40ae99e812303e5cec9249b86d9502234c39ab6f8cd67230c2aed429b106ec2309a2511d1f30506c771123829c71906eebe7bc64e4"

RPROVIDES:${PN} += "cmake(Qt6BodymovinPrivate) \
qt6-bodymovin-devel \
qt6-bodymovin-private-devel \
qt6-bodymovin-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Gui)"

inherit rpm
