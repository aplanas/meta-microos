SUMMARY = "Non-ABI stable API for the Qt 6 KMSSupport library"
DESCRIPTION = "This package provides private headers of libQt6KmsSupport that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-kmssupport-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "00e6271f8eaefa5b9d64958586d4355cf830e3f1a13dafcb05a4574fa92d70f7e6f0ff1305cc5a4e895deb2719f7406848d409dd74c609c696567470f24e7486"

RPROVIDES:${PN} += "qt6-kmssupport-private-devel"

RDEPENDS:${PN} += "qt6-kmssupport-devel-static"

inherit rpm
