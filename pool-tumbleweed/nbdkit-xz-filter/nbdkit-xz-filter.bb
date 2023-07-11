SUMMARY = "XZ filter for nbdkit"
DESCRIPTION = "This package is the xz filter for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-xz-filter-1.32.2-1.4.aarch64.rpm"
RPM_HASH = "c6a7afe9ef4d56e885d8e414c8bbc95dacf56595f7c3ccdba84b2dff470f6b975761c9d5ee3af2563389693c04ca073afdd7bb3da797bebd175ec2491b85a0ab"

RPROVIDES:${PN} += "nbdkit-xz-filter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5 \
nbdkit-server"

inherit rpm
