SUMMARY = "A semantic search tool for C and C++ codebases"
DESCRIPTION = "weggli is a semantic search tool for C and C++ codebases. It helps \
security researchers identify interesting functionality in \
large codebases. \
 \
weggli performs pattern matching on Abstract Syntax Trees based on user \
provided queries. Its query language resembles C and C++ code, making it possible \
to turn interesting code patterns into queries. \
 \
weggli has support for C++ constructs such as \
lambda expressions, range-based for loops and constexprs. \
weggli does not require the ability to build the software and can \
work with incomplete sources or missing dependencies."
LICENSE = "Apache-2.0"

PV = "0.2.4"

RPM_NAME = "weggli-0.2.4-2.4.aarch64.rpm"
RPM_HASH = "a850fa7a8d8a0d61fa6f234cb1821dc0fb91f9fe9c47ddb507944315608d6997efa1a7a298a20fde134856cec0e7a08e3bc9049d13c9c5e4d8941e78e5789b18"

RPROVIDES:${PN} += "weggli"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
