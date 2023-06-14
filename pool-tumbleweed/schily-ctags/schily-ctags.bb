SUMMARY = "A program to generate tag files for ex/vi"
DESCRIPTION = "Ctags makes a tags file for ex(1) from the specified C, Pascal, \
Fortran, YACC, lex, and lisp sources. A tags file gives the locations \
of specified objects in a group of files. Each line of the tags file \
contains the object name, the file in which it is defined, and a \
search pattern for the object definition, separated by whitespace. \
Using the tags file, ex(1) can quickly locate these object \
definitions."
LICENSE = "BSD-2-Clause & CDDL-1.0 & GPL-2.0-only & GPL-2.0-or-later & BSD-3-Clause & HPND & ISC"

PV = "2022.10.16"

RPM_NAME = "schily-ctags-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "f37f59b5a82d983c8c50ed740095cae02e13a11cce33bde1e0218ebea5f4c1ad82a59160842170bd3b85acad85fa1fb51a76cdc2d1bb9506bc0033c99126bf08"

RPROVIDES:${PN} += "schily-ctags"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
