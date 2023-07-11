SUMMARY = "Development files for Concurrency Kit"
DESCRIPTION = "Concurrency primitives, safe memory reclamation mechanisms and non-blocking \
data structures for the research, design and implementation of high performance \
concurrent systems. \
 \
This package holds the development files."
LICENSE = "BSD-2-Clause & Apache-2.0"

PV = "0.7.1"

RPM_NAME = "ck-devel-0.7.1-1.9.aarch64.rpm"
RPM_HASH = "a1dcbee682161e2120ca1cc6df50c156f2307b3a57247929d7520d696517ce83be089b42a0d9e7d66fb9cc7e73cac68726ddd541872fb99a877d22341316b8a0"

RPROVIDES:${PN} += "ck-devel \
pkgconfig-ck"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libck0"

inherit rpm
