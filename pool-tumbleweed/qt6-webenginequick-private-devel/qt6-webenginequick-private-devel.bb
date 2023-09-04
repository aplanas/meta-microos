SUMMARY = "Non-ABI stable API for the Qt 6 WebEngineQuick library"
DESCRIPTION = "This package provides private headers of libQt6WebEngineQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-webenginequick-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "7565a64464f9ceed3e2e033ae343f052381bba0c45633fbf54e039a2ec0755f77b6b6124ac34d0833f2514ca0067475e22622b886a5e0cef0647ea88444b15df"

RPROVIDES:${PN} += "qt6-webenginequick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebEngineQuick"

inherit rpm
