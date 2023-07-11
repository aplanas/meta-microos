SUMMARY = "Non-ABI stable API for the Qt 6 KMSSupport library"
DESCRIPTION = "This package provides private headers of libQt6KmsSupport that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-kmssupport-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "90b975da4027ab60c5d9d4403b7cba7f2548800e0880f95ad07f5f875db11f1dcc190d648e6ad84277ec56a0958ab88c65c7ff0768f3aa80d22f659262b335e3"

RPROVIDES:${PN} += "qt6-kmssupport-private-devel"

RDEPENDS:${PN} += "qt6-kmssupport-devel-static"

inherit rpm
