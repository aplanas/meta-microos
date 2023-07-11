SUMMARY = "Documentation for the libgtop library"
DESCRIPTION = "A library that fetches information about the running system, such as \
CPU and memory usage and active processes. \
 \
On Linux systems, this information is taken directly from the /proc \
file system. On other systems, a server is used to read information \
from /dev/kmem."
LICENSE = "GPL-2.0-or-later"

PV = "2.40.0"

RPM_NAME = "libgtop-doc-2.40.0-4.4.aarch64.rpm"
RPM_HASH = "ed0b0d32e04576bd2c29739c0bb6b9ae7d93fb861ddf1a3c138e914666c94c7742c9a1c9ee6dd992f83845652a6d75f6a76cbb40b4719b1422a5d4ec5aca50fe"

RPROVIDES:${PN} += "libgtop-doc"

RDEPENDS:${PN} += "/sbin/install-info \
/usr/bin/sh \
libgtop-2-0-11"

inherit rpm
