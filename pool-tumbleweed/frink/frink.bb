SUMMARY = "Static Testing and Formatting for Tcl Programs"
DESCRIPTION = "Frink is a Tcl formatting and static check program. It can prettify \
your program, and minimize, obfuscate, or sanity check it. It can also \
do some rewriting. \
 \
See /usr/share/doc/packages/frink/README and the output of 'frink -h' \
for details."
LICENSE = "BSD-3-Clause"

PV = "2.3.1.a2"

RPM_NAME = "frink-2.3.1.a2-1.26.aarch64.rpm"
RPM_HASH = "f379c15f6097c381ff688c2f1b4fb3d24d24ae7a8782bdba328dc864a71cb02a27d97eac287409585d37ba90711df80220e6516c18a711672e78f17494ef974f"

RPROVIDES:${PN} += "frink \
frink(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
