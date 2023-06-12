SUMMARY = "Python 3 bindings for link-grammar, a grammar checker"
DESCRIPTION = "The Link Grammar Parser is a syntactic parser of a number of \
languages, based on Link Grammar, an original theory of syntax and \
morphology. \
 \
This package contains bindings for development with Link Grammar using \
Python 3."
LICENSE = "LGPL-2.1-only"

PV = "5.10.5"

RPM_NAME = "python3-clinkgrammar-5.10.5-1.5.aarch64.rpm"
RPM_HASH = "e9bb8f9dc064a850e3c8cf11363fc3a8705de99331ed0299bfce2abb1de447795e7dd5e4723444be49437979ea066151ca935fb2db542f8d2f9b7329ebc0dfda"

RPROVIDES:${PN} += "python3-clinkgrammar \
python3-clinkgrammar(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
liblink-grammar.so.5()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
python(abi)"

inherit rpm
