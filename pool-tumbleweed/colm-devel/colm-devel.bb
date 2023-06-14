SUMMARY = "The Colm programming language environment"
DESCRIPTION = "Colm is a programming language designed for the analysis and \
transformation of computer languages. It has a type system based on \
formal languages. Rather than define classes or data structures, one \
defines grammars. A parser is constructed automatically from the \
grammar, and the parser is used for two purposes: to parse the input \
language, and to parse the structural patterns in the program that \
performs the analysis."
LICENSE = "MIT"

PV = "0.14.7"

RPM_NAME = "colm-devel-0.14.7-2.4.aarch64.rpm"
RPM_HASH = "613417928235a5afb27ded221f7108123b3e32d27dfcb558d29b0cf0683e7fa15c895446f89dc9928c1b2f23785775cc89358170f9185443bcbb3eb1c2467603"

RPROVIDES:${PN} += "colm-devel \
ragel-devel"

RDEPENDS:${PN} += "/bin/bash \
gcc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcolm-0-14-7 \
libcolm-0.14.7.so \
libfsm-0-14-7 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
