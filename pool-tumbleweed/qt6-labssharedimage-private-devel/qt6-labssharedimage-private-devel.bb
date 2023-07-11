SUMMARY = "Non-ABI stable API for the Qt 6 LabsSharedImage library"
DESCRIPTION = "This package provides private headers of libQt6LabsSharedImage that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labssharedimage-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "38a2b446c175590345feed6dbd0f946113e20fa18ba657be9632db587c00f263a968b1d87b9bae2045b7135c8c27a5ce2d696272ad8ae4da72a1abc9668df756"

RPROVIDES:${PN} += "qt6-labssharedimage-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsSharedImage"

inherit rpm
