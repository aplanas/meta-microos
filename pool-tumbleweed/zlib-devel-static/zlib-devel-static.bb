SUMMARY = "Static library for zlib"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format. \
 \
This subpackage contains the static version of the library \
used for development."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "zlib-devel-static-1.2.13-4.1.aarch64.rpm"
RPM_HASH = "013a1ccb01587d8c7bc5ba8115b109aeb42f13889b8b81a9aed84168a5dfd16ed2e6a948bc8ae23d3a61db318d214de3cee9a3ee219f2f583db8f3f9f533aba9"

RPROVIDES:${PN} += "zlib-devel-static \
zlib-devel-static(aarch-64) \
zlib-devel:/usr/lib64/libz.a"
RDEPENDS:${PN} += "zlib-devel"

inherit rpm
