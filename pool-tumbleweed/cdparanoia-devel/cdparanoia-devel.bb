SUMMARY = "Development files for cdparanoia, a library for extractnig audio tracks from CDs"
DESCRIPTION = "This CDDA reader distribution ('cdparanoia') reads audio from the \
CD-ROM directly as data and writes the data to a file or pipe as .wav, \
.aifc, or raw 16-bit linear PCM."
LICENSE = "LGPL-2.1-or-later"

PV = "3.10.2"

RPM_NAME = "cdparanoia-devel-3.10.2-28.19.aarch64.rpm"
RPM_HASH = "eea419f1850a586321526d556bc9c9ea7dc3fc02adfb28b5aba64cbbfe8dc02c6bf77474d0de0f0aa51d7404dba5b7ad663e59f03fc3030a4016726aefedc96c"

RPROVIDES:${PN} += "cdparanoia-devel \
cdparanoia-devel(aarch-64)"
RDEPENDS:${PN} += "libcdda_interface0 \
libcdda_paranoia0"

inherit rpm
