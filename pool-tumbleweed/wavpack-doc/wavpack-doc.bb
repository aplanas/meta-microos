SUMMARY = "Documentation files for wavpack, an audio compression format"
DESCRIPTION = "WavPack is an open audio compression format providing lossless, high-quality \
lossy, and unique hybrid compression modes. \
 \
This subpackage contains development documentation for applications that \
want to make use of wavpack."
LICENSE = "BSD-3-Clause"

PV = "5.6.0"

RPM_NAME = "wavpack-doc-5.6.0-1.3.aarch64.rpm"
RPM_HASH = "330c7b80e436a5b2aa75e4607a165d3c735e5079ef3c875aab4f2ba10030bdf4ba0b65d3f0d103914d0ca9eb9fc5cfb7a918267aa4f81411132479c72a6d51e0"

RPROVIDES:${PN} += "wavpack-doc"

RDEPENDS:${PN} += "wavpack"

inherit rpm
