SUMMARY = "Non-ABI stable API for the Qt 6 3DQuick library"
DESCRIPTION = "This package provides private headers of libQt63DQuick that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquick-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c4db01acecef0ad65ffbe1d9092c5bff58fbec277240472ad32a88ffa9099023e75d977ab9866c56060b3aa9d5e4e81c11657549d14a829f19464a15a6e38f8e"

RPROVIDES:${PN} += "qt6-3dquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DQuick"

inherit rpm
