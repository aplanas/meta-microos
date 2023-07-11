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

RPM_NAME = "python39-pyahocorasick-1.4.4-1.6.aarch64.rpm"
RPM_HASH = "946aedb865b1a6dd9517f1d830c360ae5ac1746a158ce2561bd9fb788c5e047be1458b4380ed087bf8a0b8881af52c1f8b2fefec788e8336862998a51367fe32"

RPROVIDES:${PN} += "python3.9dist-pyahocorasick \
python39-pyahocorasick \
python3dist-pyahocorasick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
