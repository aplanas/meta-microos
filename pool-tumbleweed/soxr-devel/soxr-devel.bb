SUMMARY = "Development files of soxr"
DESCRIPTION = "The soxr development package includes the header files, \
libraries, development tools necessary for compiling and linking \
application which will use libsoxr/libsoxr-lsr."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.3"

RPM_NAME = "soxr-devel-0.1.3-2.16.aarch64.rpm"
RPM_HASH = "23e55a74a5c3a376bdbd443a8aa393225f45e0dca339342f664c4958feb568591ae1593203fa9a62b3737cb8b69f902a26f447831c7266a3b7b1351625803784"

RPROVIDES:${PN} += "pkgconfig-soxr \
pkgconfig-soxr-lsr \
soxr-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsoxr-lsr0 \
libsoxr0"

inherit rpm
