SUMMARY = "Helper library for the Huge Translation Lookaside Buffer Filesystem"
DESCRIPTION = "The libhugetlbfs package interacts with the Linux hugetlbfs to \
make large pages available to applications in a transparent manner."
LICENSE = "LGPL-2.1-or-later"

PV = "2.23.0.g6b126a4"

RPM_NAME = "libhugetlbfs-2.23.0.g6b126a4-3.2.aarch64.rpm"
RPM_HASH = "5575a80f2ebba701e6e45b8e0e68b4bde2a202dfe85efccc9d4db8d4a0110152b97b4266c48ec73eebbc34426c3c3da4651499ff85cc96d399d60cf509a96864"

RPROVIDES:${PN} += "libhugetlbfs \
libhugetlbfs-privutils.so \
libhugetlbfs.so"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
