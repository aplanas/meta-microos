SUMMARY = "Shared library for Concurrency Kit"
DESCRIPTION = "Concurrency primitives, safe memory reclamation mechanisms and non-blocking \
data structures for the research, design and implementation of high performance \
concurrent systems. \
 \
This package holds the shared library."
LICENSE = "BSD-2-Clause & Apache-2.0"

PV = "0.7.1"

RPM_NAME = "libck0-0.7.1-1.9.aarch64.rpm"
RPM_HASH = "f146b9186ec50a5c5542c6d2b04aefd08e8bf573a3f47dd6d2252eb8e8fede235c94362cc53bc19b2d0f7092c057bc52cdd1a040ec1190e004e2be27a9cd963d"

RPROVIDES:${PN} += "libck.so.0 \
libck0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
