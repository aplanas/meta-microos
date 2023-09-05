SUMMARY = "Lisp-like functional and imperative programming language"
DESCRIPTION = "Janet is a functional and imperative programming language. \
The entire language (core library, interpreter, compiler, assembler, \
PEG) is less than 2MB. \
Janet scripting can be added to an application by embedding a single \
C source file and a single header."
LICENSE = "MIT"

PV = "1.30.0"

RPM_NAME = "janet-1.30.0-1.1.aarch64.rpm"
RPM_HASH = "1bda5ce6be5f1cdcc8f077bb21c13e62f7bfe4a94f479e1f31aa23ba790e1cc7e6b3ed5d8db9a500605b189f0396603fa57dc0f76cfb4053d5823259e8947281"

RPROVIDES:${PN} += "janet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
