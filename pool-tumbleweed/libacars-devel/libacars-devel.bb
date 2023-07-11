SUMMARY = "Development files for libacars"
DESCRIPTION = "libacars is a library for decoding various ACARS message payloads. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libacars."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "libacars-devel-1.3.1-1.17.aarch64.rpm"
RPM_HASH = "fe6e2e997c2369e08a7ebe2c969976d1cedb0bdf859ca715d0142af9839a5fd39c05f4fa39ac26151b5dcf43983450f201b1ad93e230f263d2a23b35796faedb"

RPROVIDES:${PN} += "libacars-devel \
pkgconfig-libacars"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libacars1"

inherit rpm
