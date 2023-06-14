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

RPM_NAME = "python311-pyahocorasick-1.4.4-1.4.aarch64.rpm"
RPM_HASH = "502acbe41ec27cdbd3bc8458ad00143ff9c34929f91ed25023720599b1ddd15ac8a2edb8c3c6711ac805c74a10ce78c5ef48ed2edd2e448cfc6921fca9c2247d"

RPROVIDES:${PN} += "python3.11dist-pyahocorasick \
python311-pyahocorasick \
python3dist-pyahocorasick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
