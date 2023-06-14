SUMMARY = "Lisp-like functional and imperative programming language"
DESCRIPTION = "Janet is a functional and imperative programming language. \
It runs on Windows, Linux, macOS, BSDs, and should run on other systems with some porting. \
The entire language (core library, interpreter, compiler, assembler, PEG) is less than 1MB. \
You can also add Janet scripting to an application by embedding a single C source file and a single header."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "janet-devel-1.28.0-1.1.aarch64.rpm"
RPM_HASH = "8b4e662bacab345797a4fb45b9a787293ffe365ab73ed21c64e501bafd91b201494bff7e5a41ef12da8e6e87c7f83531e6722ac43fb614cb93c9175ceac6fc73"

RPROVIDES:${PN} += "janet-devel \
pkgconfig-janet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjanet1-28"

inherit rpm
