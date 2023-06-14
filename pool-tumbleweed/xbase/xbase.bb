SUMMARY = "XBase Compatible C++ Class Library"
DESCRIPTION = "This package contains various utilities for working with X-Base files: \
checkndx (check an NDX file), copydbf (copy a DBF file structure), deletall \
(mark all records for deletion), dumphdr (print an X-Base file header), \
dumprecs (dump records for an X-Base file), packdbf (pack a database file), \
reindex (rebuild an index), undelall (undeletes all deleted records in a file), \
xbase-zap (remove all records from a DBF file)."
LICENSE = "LGPL-2.1+"

PV = "3.1.2"

RPM_NAME = "xbase-3.1.2-1.23.aarch64.rpm"
RPM_HASH = "97f0ccee4acdde06ae1bdb5e1797a66cad8b740c06adabbbea979f003597fd1023eb1b894c91244f5544a2f3b9bde8453fbb7c14afa7400b24833506c437ce8f"

RPROVIDES:${PN} += "xbase \
xbase64"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxbase64.so.1"

inherit rpm
