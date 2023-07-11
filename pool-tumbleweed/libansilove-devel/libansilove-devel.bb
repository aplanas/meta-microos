SUMMARY = "Library for converting ANSI, ASCII, and other formats to PNG"
DESCRIPTION = "This library contains shared code regarding the conversion of ANSI and \
artscene related file formats into PNG images. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libansilove."
LICENSE = "BSD-2-Clause"

PV = "1.4.1"

RPM_NAME = "libansilove-devel-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "2c6e5e588b1e2ea7c721d2149063c130025535fb52ad4f9c0bca8417e72d4b85d49e69bee56faa72c7cc91c008362638ebb765c89a0dbd615e112f1f9f6f6894"

RPROVIDES:${PN} += "libansilove-devel"

RDEPENDS:${PN} += "libansilove1"

inherit rpm
