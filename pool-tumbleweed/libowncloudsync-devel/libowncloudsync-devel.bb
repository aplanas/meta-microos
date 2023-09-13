SUMMARY = "Development files for the ownCloud synchronization library"
DESCRIPTION = "Development files for the ownCloud synchronization library. It \
implements the ownCloud sync algorithm that keeps a local directory \
in sync with the content on your cloud."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "4.2.0"

RPM_NAME = "libowncloudsync-devel-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "3f27a3e8c281b32e2fc9b736aa06055eab9800b4517fbe6ad6f2ada75a98b43a046278de790c34946e0c03bc8d8ab878b8f7320d63c5064979e5b86cb204d447"

RPROVIDES:${PN} += "cmake-ownCloud \
libowncloudsync-devel"

RDEPENDS:${PN} += "libowncloudsync0"

inherit rpm
