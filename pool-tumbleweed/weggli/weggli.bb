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

RPM_NAME = "weggli-0.2.4-2.3.aarch64.rpm"
RPM_HASH = "c9c54bb5bdb537f9b561f87c1110ee3fc35f330b84d5ed57874616287ca513222f35997783c941c3f4935b32b9183963c2a430f22e0a1b144739cd6ea1e96167"

RPROVIDES:${PN} += "weggli \
weggli(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
