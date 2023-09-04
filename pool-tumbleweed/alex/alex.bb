SUMMARY = "Alex is a tool for generating lexical analysers in Haskell"
DESCRIPTION = "Alex is a tool for generating lexical analysers in Haskell. It takes a \
description of tokens based on regular expressions and generates a Haskell \
module containing code for scanning text efficiently. It is similar to the tool \
lex or flex for C/C++."
LICENSE = "BSD-3-Clause"

PV = "3.2.7.4"

RPM_NAME = "alex-3.2.7.4-2.2.aarch64.rpm"
RPM_HASH = "e2b7c5a9816f02e8db785abe28b5122d6b12a0321f423459ef65bfb8e4846f2bacf6118736fd76d0f8704aba593354abe8ddf05e502dc4202936f01f95611835"

RPROVIDES:${PN} += "alex"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
