SUMMARY = "Flexible File System Benchmark"
DESCRIPTION = "The Flexible Filesystem Benchmark (FFSB) is a filesystem performance \
measurement tool.  It uses customizable profiles to measure of different \
workloads, and it supports multiple groups of threads across multiple \
filesystems."
LICENSE = "GPL-2.0-only"

PV = "6.0_rc2"

RPM_NAME = "ffsb-6.0_rc2-2.20.aarch64.rpm"
RPM_HASH = "c84071251f98da7bf3f870ed6d44173895d970d730ed9a03d16874449ec9ca344a7c6ee53e44324669e2a5d2b02b0518189b0c99bff038a4af5422fe1ae02acb"

RPROVIDES:${PN} += "ffsb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
