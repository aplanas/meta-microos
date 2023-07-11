SUMMARY = "Alex is a tool for generating lexical analysers in Haskell"
DESCRIPTION = "Alex is a tool for generating lexical analysers in Haskell. It takes a \
description of tokens based on regular expressions and generates a Haskell \
module containing code for scanning text efficiently. It is similar to the tool \
lex or flex for C/C++."
LICENSE = "BSD-3-Clause"

PV = "3.2.7.4"

RPM_NAME = "alex-3.2.7.4-1.1.aarch64.rpm"
RPM_HASH = "a7c5ec612d77625ea51d03cf331ad95a37bd6f6590eb6e235e24029dfb535db2ed751b1c0edca201a921f2289894700ec623ae8390f4a2ae1bf440a74437f89a"

RPROVIDES:${PN} += "alex"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
