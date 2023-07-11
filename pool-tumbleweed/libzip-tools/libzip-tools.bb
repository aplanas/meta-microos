SUMMARY = "Utilities from the libzip project"
DESCRIPTION = "This subpackage contains zipcmp and zipmerge, for comparison of two \
archives, and merging multiple archives together, respectively."
LICENSE = "BSD-3-Clause"

PV = "1.10.0"

RPM_NAME = "libzip-tools-1.10.0-1.1.aarch64.rpm"
RPM_HASH = "b6d9bccfbbe4ce3229b4bb93ba247cfde5c89cf27e51aca0e31c4f55dc038a4ec18cc2a835fc10d8c0a72864a09bd968d7230ccb21cb08d37a935ee4b01f7643"

RPROVIDES:${PN} += "libzip \
libzip-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzip.so.5"

inherit rpm
