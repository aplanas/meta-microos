SUMMARY = "Source Code Beautifier for C, C++, C#, ObjectiveC, D"
DESCRIPTION = "Source Code Beautifier for C, C++, C#, ObjectiveC, D, Java, Pawn and VALA. \
 \
Features: \
  * Ident code, aligning on parens, assignments, etc. \
  * Align on '=' and variable definitions. \
  * Align structure initializers. \
  * Align #define stuff. \
  * Align backslash-newline stuff. \
  * Reformat comments (a little bit). \
  * Fix inter-character spacing. \
  * Add or remove parens on return statements. \
  * Add or remove braces on single-statement if/do/while/for statements. \
  * Supports embedded SQL 'EXEC SQL' stuff. \
  * Highly configurable - 454 configurable options as of version 0.60."
LICENSE = "GPL-2.0-or-later"

PV = "0.77.1"

RPM_NAME = "uncrustify-0.77.1-1.1.aarch64.rpm"
RPM_HASH = "26e6bf883493fddc9bce26cf44965b709838cfd687fb51c48abf4e2a93a364401b1e02eb11dfb2206048792ee4109c5afb5042160e9372802d1ad8095380f0be"

RPROVIDES:${PN} += "uncrustify"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
