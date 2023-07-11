SUMMARY = "Non-ABI stable experimental API for the Qt5 KMS support library"
DESCRIPTION = "This package provides private headers of libQt5KmsSupport that are \
normally not used by application development and that do not have any \
ABI or API guarantees. The packages that build against these have to \
require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5KmsSupport-private-headers-devel-5.15.10+kde129-1.1.noarch.rpm"
RPM_HASH = "b71eda19560a63038c5ff860d53747934f5d08f3807aff43693b71c82dac1131933037fc122333094c2e94372d907f61a56224086674b9b640c2e897f03f31f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5KmsSupport-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5KmsSupport-devel-static"

inherit rpm
