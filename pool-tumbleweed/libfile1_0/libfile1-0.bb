SUMMARY = "Library for heuristic file type determination based on content"
DESCRIPTION = "The library implements a heuristic file type determinator, \
similar to file/libmagic1."
LICENSE = "BSD-2-Clause"

PV = "2022.10.16"

RPM_NAME = "libfile1_0-2022.10.16-47.4.aarch64.rpm"
RPM_HASH = "93ee0914facdbf341d13a86945a535b1906cd3a39d66abd8d2edd3c87b39ff767bc937d806013b67498bfbee05fc48c55855ec01f88c93b97ba675e436c04646"

RPROVIDES:${PN} += "libfile.so.1.0 \
libfile1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libschily.so.2.0"

inherit rpm
