SUMMARY = "Utility to extract information from vmcores"
DESCRIPTION = "Kdumpid extracts information such as type of dump, architecture \
and kernel version from raw vmcores (Kernel memory dumps)."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "kdumpid-1.5-1.1.aarch64.rpm"
RPM_HASH = "d1ef9bb4efc038481fdf476c0dfab58267ba46270b8276c902e81ffd4165c42eaf8e20f1674d548e832c2730980969c943b8e0f4b075f70b4abef55438c0e33a"

RPROVIDES:${PN} += "kdumpid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaddrxlat.so.3 \
libc.so.6 \
libkdumpfile.so.10 \
libsframe.so.0 \
libz.so.1 \
libzstd.so.1"

inherit rpm
