SUMMARY = "Headers for the ZMusic library"
DESCRIPTION = "This subpackage contains the headers for the zmusic library, which is ZDoom's \
music component library."
LICENSE = "GPL-3.0-only"

PV = "1.1.11"

RPM_NAME = "zmusic-devel-1.1.11-2.3.aarch64.rpm"
RPM_HASH = "b93393dadfc4302eb862f83c99c91ecd40a15149db9283cb24e8f94c4d902d6b6c7e1cc30c5273c440b9b23e0dbb07676ee675e1a07b890b8f45ebbc7f5d82e4"

RPROVIDES:${PN} += "cmake-ZMusic \
zmusic-devel"

RDEPENDS:${PN} += "libzmusic1"

inherit rpm
