SUMMARY = "A preprocessor compliant to C99"
DESCRIPTION = "ucpp is a preprocessor for C source code, specifically code compliant to the \
ISO standard 9899:1999, also known as C99. A preprocessor is responsible for \
macro replacement, conditional compilation and inclusion of header files. \
 \
ucpp operates in two modes: \
-- lexer mode: ucpp is linked to some other code and outputs a stream of \
tokens (each call to the lex() function will yield one token) \
-- non-lexer mode: ucpp preprocesses text and outputs the resulting text \
to a file descriptor; if linked to some other code, the cpp() function \
must be called repeatedly, otherwise ucpp is a stand-alone binary."
LICENSE = "BSD-3-Clause"

PV = "1.3.5"

RPM_NAME = "ucpp-1.3.5-2.19.aarch64.rpm"
RPM_HASH = "e172ce6bff776977860c4605388092e4be28b00b10cfcbf70d6fef34e6342f33f1a1238a4bda905a716daaf91697c355a706d07b61a259c384d62917f8494bdf"

RPROVIDES:${PN} += "ucpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libucpp.so.13"

inherit rpm
