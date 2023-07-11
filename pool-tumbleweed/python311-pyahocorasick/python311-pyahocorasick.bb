SUMMARY = "Library for exact or approximate multi-pattern string search"
DESCRIPTION = "pyahocorasick is a library for exact or approximate \
multi-pattern string search, meaning that one can find \
multiple key strings occurrences at once in some input text.  The \
library provides an `ahocorasick` Python module that you can use as \
a plain dict-like Trie or convert a Trie to an automaton for efficient \
Aho-Corasick search. \
 \
It is implemented in C."
LICENSE = "BSD-3-Clause"

PV = "1.4.4"

RPM_NAME = "python311-pyahocorasick-1.4.4-1.6.aarch64.rpm"
RPM_HASH = "7cd244c5b7a03da148431736482ce424974416f6109554e3d44cc79527d892108ce7154c11df495e3218b1df8ec06d9dc67ea874351f92c890d029c4caf9f97d"

RPROVIDES:${PN} += "python3-pyahocorasick \
python3.11dist-pyahocorasick \
python311-pyahocorasick \
python3dist-pyahocorasick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
