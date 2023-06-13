SUMMARY = "API documentation for openjpeg2"
DESCRIPTION = "The OpenJPEG library is an open-source JPEG 2000 codec written in C language. \
 \
This package provides the API documentation for openjpeg2."
LICENSE = "BSD-2-Clause"

PV = "2.5.0"

RPM_NAME = "openjpeg2-devel-doc-2.5.0-3.3.aarch64.rpm"
RPM_HASH = "ea16fc69c94541c8ff5a5e04ba41da62d2b5b106695acc282390c84526206dc3f6e063c2c7e8aaeda53d71530f326e7a30fbd2c9e1e74828d9c524ee90865be8"

RPROVIDES:${PN} += "openjpeg2-devel-doc \
openjpeg2-devel-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
