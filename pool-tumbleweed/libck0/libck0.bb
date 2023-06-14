SUMMARY = "Shared library for Concurrency Kit"
DESCRIPTION = "Concurrency primitives, safe memory reclamation mechanisms and non-blocking \
data structures for the research, design and implementation of high performance \
concurrent systems. \
 \
This package holds the shared library."
LICENSE = "BSD-2-Clause & Apache-2.0"

PV = "0.7.1"

RPM_NAME = "libck0-0.7.1-1.8.aarch64.rpm"
RPM_HASH = "b814bebc084724fa819b30b6469df6f948f3f59ac544516678e3498566e7d36fa1ee285c1724d272aa9c8a0bc5b06bd0f5778da4e399c2fa104b04d3cbad30b4"

RPROVIDES:${PN} += "libck.so.0 \
libck0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
