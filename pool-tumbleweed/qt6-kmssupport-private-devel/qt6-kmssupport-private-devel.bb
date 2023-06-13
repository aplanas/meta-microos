SUMMARY = "Non-ABI stable API for the Qt 6 KMSSupport library"
DESCRIPTION = "This package provides private headers of libQt6KmsSupport that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-kmssupport-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "3c5e1bc8c486d5be708c880a63e2e6c5a79d39af6a1eb1988d943bb6bc0b51ca1978a5b96462b298dac9e594b2c47966c7cb7910b96f0cadd6cca3a3652ee47f"

RPROVIDES:${PN} += "qt6-kmssupport-private-devel \
qt6-kmssupport-private-devel(aarch-64)"

RDEPENDS:${PN} += "qt6-kmssupport-devel-static"

inherit rpm
