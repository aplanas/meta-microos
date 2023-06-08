SUMMARY = "Flexible File System Benchmark"
DESCRIPTION = "The Flexible Filesystem Benchmark (FFSB) is a filesystem performance \
measurement tool.  It uses customizable profiles to measure of different \
workloads, and it supports multiple groups of threads across multiple \
filesystems."
LICENSE = "GPL-2.0-only"

PV = "6.0_rc2"

RPM_NAME = "ffsb-6.0_rc2-2.19.aarch64.rpm"
RPM_HASH = "cdcef31e101cade542f64d44a41c4cf40c00e0cca9248d29bc985b10d77f8abd39d6ebf8f8f0f47d02bd6c95dafa2dab57a1f04f5fea709f98d6cb370bed7817"

RPROVIDES:${PN} += "ffsb ffsb(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
