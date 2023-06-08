SUMMARY = "Development files for Concurrency Kit"
DESCRIPTION = "Concurrency primitives, safe memory reclamation mechanisms and non-blocking \
data structures for the research, design and implementation of high performance \
concurrent systems. \
 \
This package holds the development files."
LICENSE = "BSD-2-Clause & Apache-2.0"

PV = "0.7.1"

RPM_NAME = "ck-devel-0.7.1-1.8.aarch64.rpm"
RPM_HASH = "2f452e32d6a6362eba82eb06ce847ed134d4b0aa6728d1f869f736fbf9773172dbec8aa325f5f6c4d91fa016a6dbf82ef3313228ea7671c51a154d47fa20b400"

RPROVIDES:${PN} += "ck-devel ck-devel(aarch-64) pkgconfig(ck)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libck0"

inherit rpm
