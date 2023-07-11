SUMMARY = "Lisp-like functional and imperative programming language"
DESCRIPTION = "Janet is a functional and imperative programming language. \
The entire language (core library, interpreter, compiler, assembler, \
PEG) is less than 2MB. \
Janet scripting can be added to an application by embedding a single \
C source file and a single header."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "janet-1.28.0-2.1.aarch64.rpm"
RPM_HASH = "b0a43c737a8f07946d8d3791dbea26adb6613cb3f353bd74ecccfbdd0270bece00cc543615ebdc4109d0ad30a877c180f94f33ad649d56039ebf2dfe35967d4c"

RPROVIDES:${PN} += "janet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
