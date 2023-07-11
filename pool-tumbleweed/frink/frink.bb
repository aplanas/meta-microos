SUMMARY = "Static Testing and Formatting for Tcl Programs"
DESCRIPTION = "Frink is a Tcl formatting and static check program. It can prettify \
your program, and minimize, obfuscate, or sanity check it. It can also \
do some rewriting. \
 \
See /usr/share/doc/packages/frink/README and the output of 'frink -h' \
for details."
LICENSE = "BSD-3-Clause"

PV = "2.3.1.a2"

RPM_NAME = "frink-2.3.1.a2-1.27.aarch64.rpm"
RPM_HASH = "594571c2950f036b5007cebbf007104bbd4cbe811998366c3bee364a0b58d07dfe7ea0f4ddcacd0cb2f62ba5458f45aa697f7a3119c9dd0d5afed93d5af4854d"

RPROVIDES:${PN} += "frink"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
