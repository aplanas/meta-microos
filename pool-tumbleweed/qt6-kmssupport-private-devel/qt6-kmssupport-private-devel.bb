SUMMARY = "Non-ABI stable API for the Qt 6 KMSSupport library"
DESCRIPTION = "This package provides private headers of libQt6KmsSupport that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-kmssupport-private-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "2f71d3a76b5c98997dc3271de1c82ce60c605b102e5f7835e22077a913defdf9fda86538bbef77ca667f5ca6c0c4fb82e51b603dc6542a02a9866dafc039e351"

RPROVIDES:${PN} += "qt6-kmssupport-private-devel"

RDEPENDS:${PN} += "qt6-kmssupport-devel-static"

inherit rpm
