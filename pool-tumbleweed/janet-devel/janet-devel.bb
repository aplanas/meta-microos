SUMMARY = "Headers for embedding Janet scripting"
DESCRIPTION = "Janet is a functional and imperative programming language. \
Janet scripting can be added to an application by embedding a single \
C source file and a single header."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "janet-devel-1.28.0-2.1.aarch64.rpm"
RPM_HASH = "951e73359f8a2b1b72b00ba4baad115d8e1da3e72180f1ef52b653924675037955e9d50f897a406ed4b48f3cab6f60e5bf5934199bd59bfb0212dde1bbaf92a0"

RPROVIDES:${PN} += "janet-devel \
pkgconfig-janet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjanet1-28"

inherit rpm
