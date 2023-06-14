SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickInput library"
DESCRIPTION = "This package provides private headers of libQt63DQuickInput that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquickinput-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "66645f6e75bef30a9f3dc26fb4fb4490030e06c65ca8b6c77bb3929321fe5afc299962e6fbed26cbc16910ffb14806281735d30e2617adec48bbd1a40f6113e7"

RPROVIDES:${PN} += "qt6-3dquickinput-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DQuickInput"

inherit rpm
