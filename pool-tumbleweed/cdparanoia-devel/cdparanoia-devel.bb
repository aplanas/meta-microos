SUMMARY = "Development files for cdparanoia, a library for extractnig audio tracks from CDs"
DESCRIPTION = "This CDDA reader distribution ('cdparanoia') reads audio from the \
CD-ROM directly as data and writes the data to a file or pipe as .wav, \
.aifc, or raw 16-bit linear PCM."
LICENSE = "LGPL-2.1-or-later"

PV = "3.10.2"

RPM_NAME = "cdparanoia-devel-3.10.2-28.20.aarch64.rpm"
RPM_HASH = "8eb3f9f0ec1351dead699526afe66fda87cb22d49ac81aed78b16e1fd2f52a2b3a3d24560c330d9f41a2fef4578390ed6cd6e59747848811f1a73368349f24c6"

RPROVIDES:${PN} += "cdparanoia-devel"

RDEPENDS:${PN} += "libcdda-interface0 \
libcdda-paranoia0"

inherit rpm
