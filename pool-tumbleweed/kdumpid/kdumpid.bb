SUMMARY = "Utility to extract information from vmcores"
DESCRIPTION = "Kdumpid extracts information such as type of dump, architecture \
and kernel version from raw vmcores (Kernel memory dumps)."
LICENSE = "GPL-2.0-or-later"

PV = "1.4"

RPM_NAME = "kdumpid-1.4-1.1.aarch64.rpm"
RPM_HASH = "c3b6ade9bc987028898609f6485faa6ecdf40e678c7714fc316bd2c4e15cf505162f930d1cbf1b5e4c2af78db7c467b70c3f5f4645ce232b05974513849b419a"

RPROVIDES:${PN} += "kdumpid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaddrxlat.so.3 \
libc.so.6 \
libkdumpfile.so.10 \
libsframe.so.0 \
libz.so.1 \
libzstd.so.1"

inherit rpm
