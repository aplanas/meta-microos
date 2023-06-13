SUMMARY = "Lisp-like functional and imperative programming language"
DESCRIPTION = "Janet is a functional and imperative programming language. \
It runs on Windows, Linux, macOS, BSDs, and should run on other systems with some porting. \
The entire language (core library, interpreter, compiler, assembler, PEG) is less than 1MB. \
You can also add Janet scripting to an application by embedding a single C source file and a single header."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "janet-1.28.0-1.1.aarch64.rpm"
RPM_HASH = "60746097e2e67783591ed00f0bb763990b2aff59cc213872ad8d13db38d2090af29af910e6b45fb2d8a9a656d968e95cd63b0796e89435e8e78e72797242929c"

RPROVIDES:${PN} += "janet \
janet(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
