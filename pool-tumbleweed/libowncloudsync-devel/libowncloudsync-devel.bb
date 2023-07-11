SUMMARY = "Development files for the ownCloud synchronization library"
DESCRIPTION = "Development files for the ownCloud synchronization library. It \
implements the ownCloud sync algorithm that keeps a local directory \
in sync with the content on your cloud."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "4.1.0"

RPM_NAME = "libowncloudsync-devel-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "5879638c12350874558d64809316c853560fc6551d99aa289b5ad15428864f62cb5cb2e610f980cb6208cb5c0dc6b571e4c2258799b8c14d14def47ee420474e"

RPROVIDES:${PN} += "cmake-ownCloud \
libowncloudsync-devel"

RDEPENDS:${PN} += "libowncloudsync0"

inherit rpm
