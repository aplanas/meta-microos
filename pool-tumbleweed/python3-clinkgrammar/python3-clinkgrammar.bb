SUMMARY = "Python 3 bindings for link-grammar, a grammar checker"
DESCRIPTION = "The Link Grammar Parser is a syntactic parser of a number of \
languages, based on Link Grammar, an original theory of syntax and \
morphology. \
 \
This package contains bindings for development with Link Grammar using \
Python 3."
LICENSE = "LGPL-2.1-only"

PV = "5.10.5"

RPM_NAME = "python3-clinkgrammar-5.10.5-1.6.aarch64.rpm"
RPM_HASH = "646fb4cd9b9e732a9f5d902e98b61373465c60c75891ab488a1dee0a5e16a6935adbf63b7398df4bc1387c3ecf50013fe56be1ca73ed122f945c5c6224c32c63"

RPROVIDES:${PN} += "python3-clinkgrammar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblink-grammar.so.5 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
