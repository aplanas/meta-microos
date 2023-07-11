SUMMARY = "Shared library from libs3"
DESCRIPTION = "This package includes the libs3 shared object library, needed to run \
applications compiled against libs3, and additionally contains the s3 \
utility for accessing Amazon S3."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "4.1.git277"

RPM_NAME = "libs3-4-4.1.git277-1.16.aarch64.rpm"
RPM_HASH = "efe7409ec57112ab6334a6274d3d543de9c1c68d1260d30372e0b51b4ae9430d7524148d4f484c97b677c916d205bf624fb8ea0a7cc6825fd35c5c69e8533885"

RPROVIDES:${PN} += "libs3-4 \
libs3.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libxml2.so.2"

inherit rpm
