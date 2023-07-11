SUMMARY = "Development Tools for applications which will use the Libjpeg Library"
DESCRIPTION = "The libjpeg-devel package includes the header files and libraries \
necessary for compiling and linking programs which will manipulate JPEG \
files using the libjpeg library."
LICENSE = "BSD-3-Clause"

PV = "62.3.0"

RPM_NAME = "libjpeg62-devel-62.3.0-76.1.aarch64.rpm"
RPM_HASH = "af98fc9becdd0648a77d818f847302e5638710e26c9e210e95305a6b243ba055a484b22a4f04126a8f7e54871ab7bfc2f4bee141cd14014c98aba77801706dd0"

RPROVIDES:${PN} += "libjpeg-devel \
libjpeg62-devel \
pkgconfig-libjpeg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjpeg62"

inherit rpm
