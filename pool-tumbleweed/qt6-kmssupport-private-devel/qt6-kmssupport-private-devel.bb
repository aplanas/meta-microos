SUMMARY = "Non-ABI stable API for the Qt 6 KMSSupport library"
DESCRIPTION = "This package provides private headers of libQt6KmsSupport that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-kmssupport-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "1626e8b561204e9e25eeb0bb4507d5010d47a5a0870f81a00fa1670e52d3ff953d0b3085354db61bcf8c8375616fa291ce03a57bd0d1f7ddf55ad2378af6ea85"

RPROVIDES:${PN} += "qt6-kmssupport-private-devel"

RDEPENDS:${PN} += "qt6-kmssupport-devel-static"

inherit rpm
