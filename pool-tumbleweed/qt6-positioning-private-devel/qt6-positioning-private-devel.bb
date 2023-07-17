SUMMARY = "Non-ABI stable API for the Qt 6 Positioning Library"
DESCRIPTION = "This package provides private headers of libQt6Positioning that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioning-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "8bbacff9d29dd707f2ff2014370917672d2e0b021d585e7361ea86c58d0af18231a9f1e0b144d45ef3cdec966666dd7574d859bc159de4c8f9272222b4d11cc4"

RPROVIDES:${PN} += "qt6-positioning-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Positioning"

inherit rpm
