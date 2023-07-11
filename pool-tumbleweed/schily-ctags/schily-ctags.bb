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

RPM_NAME = "schily-ctags-2022.10.16-47.4.aarch64.rpm"
RPM_HASH = "f892fd3fae4bcbd3bdaad09abc8267fa0fb2bac7dc7ba9a5c76f0127a6d83ca8d94c3d8aa822acdf5c2cc2feb00f9d4f36320a6ec28863d2a83bf5871c3611f2"

RPROVIDES:${PN} += "schily-ctags"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
