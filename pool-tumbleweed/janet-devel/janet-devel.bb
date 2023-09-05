SUMMARY = "Headers for embedding Janet scripting"
DESCRIPTION = "Janet is a functional and imperative programming language. \
Janet scripting can be added to an application by embedding a single \
C source file and a single header."
LICENSE = "MIT"

PV = "1.30.0"

RPM_NAME = "janet-devel-1.30.0-1.1.aarch64.rpm"
RPM_HASH = "c1e6c058e9810c5f329d0f6f2dd64f94c296bee56edaea49cdfc59e14e34c1ad74d4ac3b3309bb60051ad9f52f2a0257401308b65bda33f21660bc4b1add1c25"

RPROVIDES:${PN} += "janet-devel \
pkgconfig-janet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjanet1-30"

inherit rpm
