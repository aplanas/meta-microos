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

RPM_NAME = "colm-devel-0.14.7-2.5.aarch64.rpm"
RPM_HASH = "632f2de4a08dc5fcc2901dde5b9edb9b70ce531cd1bfd5e25d32604dd398ff7112a6304c7d3de8ba861ebd58ffa7c79a8309064c4c27c3905d22dc646433cf5a"

RPROVIDES:${PN} += "colm-devel \
ragel-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
gcc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcolm-0-14-7 \
libcolm-0.14.7.so \
libfsm-0-14-7 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
