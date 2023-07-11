SUMMARY = "XBase Compatible C++ Class Library"
DESCRIPTION = "This package contains various utilities for working with X-Base files: \
checkndx (check an NDX file), copydbf (copy a DBF file structure), deletall \
(mark all records for deletion), dumphdr (print an X-Base file header), \
dumprecs (dump records for an X-Base file), packdbf (pack a database file), \
reindex (rebuild an index), undelall (undeletes all deleted records in a file), \
xbase-zap (remove all records from a DBF file)."
LICENSE = "LGPL-2.1+"

PV = "3.1.2"

RPM_NAME = "xbase-3.1.2-1.24.aarch64.rpm"
RPM_HASH = "6f801bca8e0701c17e74d281715ee1be5d2627b5382c4a75ed6af6cbe389881a46a1f36ab8fbd98e45cb460d28c20134ed697f2b7d8a9cd689dfab390ce398af"

RPROVIDES:${PN} += "xbase \
xbase64"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxbase64.so.1"

inherit rpm
