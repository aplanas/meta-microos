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

RPM_NAME = "python39-pyahocorasick-1.4.4-1.4.aarch64.rpm"
RPM_HASH = "96f2ff078b8d36f2970e188fe7ca1c78279e3f9e8d528b7aef3364aff6257e91bbe6ed36e6e88a68ad47b1138a5f2f38c8c38137254d8ed1045ddc666bb24845"

RPROVIDES:${PN} += "python3.9dist(pyahocorasick) \
python39-pyahocorasick \
python39-pyahocorasick(aarch-64) \
python3dist(pyahocorasick)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
