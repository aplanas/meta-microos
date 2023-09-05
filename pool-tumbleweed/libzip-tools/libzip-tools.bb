SUMMARY = "Utilities from the libzip project"
DESCRIPTION = "This subpackage contains zipcmp and zipmerge, for comparison of two \
archives, and merging multiple archives together, respectively."
LICENSE = "BSD-3-Clause"

PV = "1.10.1"

RPM_NAME = "libzip-tools-1.10.1-1.1.aarch64.rpm"
RPM_HASH = "d5380c6f7de85c5ed329ddb52e93dc6579cf6757310a2ecee90b432fd26a06abc3892e246cd726d5aa688c6ad39b02b6d5208de8b1b0a2153d5f7db0ab2d9634"

RPROVIDES:${PN} += "libzip \
libzip-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzip.so.5"

inherit rpm
