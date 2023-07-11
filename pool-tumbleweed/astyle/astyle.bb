SUMMARY = "Source Code Indenter, Formatter, and Beautifier for C, C++, C# and Java"
DESCRIPTION = "Artistic Style is a source code indenter, formatter, and beautifier for the C, \
C++, C# and Java programming languages. It automatically re-indents and \
re-formats C / C++ / C# / Java source files. It can be used from a command \
line, or it can be incorporated as classes in another C++ program."
LICENSE = "MIT"

PV = "3.4"

RPM_NAME = "astyle-3.4-1.1.aarch64.rpm"
RPM_HASH = "ab5873468923379412ea22c6de9e5f2ed5c59d6a28e40fadfccc8c7d90fd2074c11f8cda45f94309c622484bbf6a142e7d033ed175f0d8b0f7c9912d7da96652"

RPROVIDES:${PN} += "astyle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
