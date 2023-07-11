SUMMARY = "Library for CRIU"
DESCRIPTION = "This package contains the library for CRIU, Checkpoint/Restore In \
Userspace Tools."
LICENSE = "LGPL-2.1-only"

PV = "3.18"

RPM_NAME = "libcriu2-3.18-1.2.aarch64.rpm"
RPM_HASH = "1f28a732d616e076b65caa7dcae226850cce1bd66420568e63ce7663ae8c427dec0abdaeb6927353b84752ed9abf724beda724cf310373219dc056f50c7f64b6"

RPROVIDES:${PN} += "libcriu.so.2 \
libcriu2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libprotobuf-c.so.1"

inherit rpm
