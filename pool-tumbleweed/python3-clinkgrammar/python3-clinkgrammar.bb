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

RPROVIDES:${PN} += "python3-clinkgrammar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblink-grammar.so.5 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
