SUMMARY = "Lossless compression library for scientific data"
DESCRIPTION = "Lossless compression library for scientific data. Libsz2 is a drop-in \
replacement for the SZIP library (http://www.hdfgroup.org/doc_resource/SZIP)."
LICENSE = "BSD-2-Clause"

PV = "1.0.6"

RPM_NAME = "libsz2-1.0.6-1.8.aarch64.rpm"
RPM_HASH = "2ddcc572314e7ff914dbfd12c731cd177bccd453184c70f9974afb1766c5c2726bc91e5bed4e2b3bac8e54e603e875aee5604bc796b63bcacf6c42356c3a350d"

RPROVIDES:${PN} += "libsz.so.2 \
libsz2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
