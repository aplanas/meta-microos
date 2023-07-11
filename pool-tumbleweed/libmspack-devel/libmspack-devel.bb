SUMMARY = "Static libraries, header files and documentation for libmspack"
DESCRIPTION = "The libmspack-devel package contains the header files and static \
libraries necessary for developing programs using libmspack."
LICENSE = "LGPL-2.1-only"

PV = "0.11"

RPM_NAME = "libmspack-devel-0.11-1.4.aarch64.rpm"
RPM_HASH = "c48c115d2caf508888b4d7157ffd85350803576a78e763b00324f7ea8485ffdb49d810ca47dac32a15a0a505fad219520c009a492c484d7d4d1419ab04b09599"

RPROVIDES:${PN} += "libmspack-devel \
pkgconfig-libmspack"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmspack0"

inherit rpm
