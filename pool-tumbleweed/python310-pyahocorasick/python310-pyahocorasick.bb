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

RPM_NAME = "python310-pyahocorasick-1.4.4-1.6.aarch64.rpm"
RPM_HASH = "02692b8123196854cc1d06afb43cb72c18e94f4323966f76efce91c0fd1d4ca6535e2746db67d03e6223a84f61e326a9b3fe27826b8691bb3cfc4953cc5a6869"

RPROVIDES:${PN} += "python3.10dist-pyahocorasick \
python310-pyahocorasick \
python3dist-pyahocorasick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
