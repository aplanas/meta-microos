SUMMARY = "Documentation for the libgtop library"
DESCRIPTION = "A library that fetches information about the running system, such as \
CPU and memory usage and active processes. \
 \
On Linux systems, this information is taken directly from the /proc \
file system. On other systems, a server is used to read information \
from /dev/kmem."
LICENSE = "GPL-2.0-or-later"

PV = "2.40.0"

RPM_NAME = "libgtop-doc-2.40.0-4.3.aarch64.rpm"
RPM_HASH = "f1b8c39b9cdcafe132fbfc55f8ed2e4374bece40981d0a694357a432ee3ad489ed02fff2ccd659cf56996a409d4e893b29e0f30d91318aa9df7e1b99e2af93b6"

RPROVIDES:${PN} += "libgtop-doc \
libgtop-doc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/install-info \
libgtop-2_0-11"

inherit rpm
