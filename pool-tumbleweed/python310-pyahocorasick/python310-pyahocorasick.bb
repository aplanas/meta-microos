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

RPM_NAME = "python310-pyahocorasick-1.4.4-1.4.aarch64.rpm"
RPM_HASH = "db8cdf2b05a08c78c42427825321268c2004428d0ef332a2be9f7c2ec506410e8fbf7833e2221363dcb85a1996ef38c04d1ad139ea9113596f27c1aef792af53"

RPROVIDES:${PN} += "python3-pyahocorasick \
python3.10dist(pyahocorasick) \
python310-pyahocorasick \
python310-pyahocorasick(aarch-64) \
python3dist(pyahocorasick)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
