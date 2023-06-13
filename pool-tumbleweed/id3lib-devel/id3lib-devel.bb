SUMMARY = "Documentation and Headers for id3lib"
DESCRIPTION = "This package contains the headers and documentation for the id3lib API \
that programmers will need to develop applications which use id3lib, \
the software library for ID3v1 and ID3v2 tag manipulation."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.3"

RPM_NAME = "id3lib-devel-3.8.3-268.9.aarch64.rpm"
RPM_HASH = "efa0a558ae113bb1255a1fb381f10b38d484c386689413a25d8d73d92222f625227f99b288a65f9af91ce8e2edb0930faacb89b0ad6a3f2b6fc49b0f685c9886"

RPROVIDES:${PN} += "id3lib-devel \
id3lib-devel(aarch-64)"

RDEPENDS:${PN} += "libid3-3_8-3 \
libstdc++-devel"

inherit rpm
