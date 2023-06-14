SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickAnimation library"
DESCRIPTION = "This package provides private headers of libQt63DQuickAnimation that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquickanimation-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "a8f4398b0ea8e69d757c48e89da4a5b1abcbd639b39eabb943a65a409ce7cffc6ce754d9196e7cc89b870747dd48cbcf888ca9014c711a3b2c5abd0a6d400465"

RPROVIDES:${PN} += "qt6-3dquickanimation-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DQuickAnimation"

inherit rpm
