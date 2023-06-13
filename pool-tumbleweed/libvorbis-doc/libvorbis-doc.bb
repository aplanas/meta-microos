SUMMARY = "Documentation of Ogg/Vorbis library"
DESCRIPTION = "This package contains documents for Ogg/Vorbis library, including the \
API reference."
LICENSE = "BSD-3-Clause"

PV = "1.3.7"

RPM_NAME = "libvorbis-doc-1.3.7-4.1.noarch.rpm"
RPM_HASH = "1084886d4fa1d0fb98b73b90b7cb4b8d72c83447076d11dc82cc777c5ea323323561f5515a4c90c9518ed3f9ac27d9ba897cc699f20152541f0d5c2fcb4e18ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libvorbis-doc"

RDEPENDS:${PN} += ""

inherit rpm
