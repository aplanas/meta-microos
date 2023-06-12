SUMMARY = "Development files for librsync"
DESCRIPTION = "librsync implements the 'rsync' algorithm, which allows remote \
differencing of binary files.  librsync computes a delta relative to a \
file's checksum, so the two files need not both be present to generate \
a delta."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.4"

RPM_NAME = "librsync-devel-2.3.4-1.2.aarch64.rpm"
RPM_HASH = "dc08d777712a0437a384226acbc27f5ec0aaa0b28ef6d1c67abdf95b65a42f5c9519518a15a2ee42cd8ad4c55103cfb9f8638f0e461bc9354352952348b30c0a"

RPROVIDES:${PN} += "librsync-devel \
librsync-devel(aarch-64)"
RDEPENDS:${PN} += "librsync2"

inherit rpm
