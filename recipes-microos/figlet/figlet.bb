SUMMARY = "Tool for Creating Cool ASCII-Art Signatures"
DESCRIPTION = "FIGlet can create characters in many different styles and can kern and \
'smush' these characters together in various ways. FIGlet output is \
generally reminiscent of the sort of 'signatures' many people like to \
put at the end of e-mail and UseNet messages."
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "figlet-2.2.5-2.23.aarch64.rpm"
RPM_HASH = "e64815aecfa698256a70e2f18ecdb26a1360a165019374662c6d0d2cb3e35bb4e588143576d69f172e57ade2ee5c47fa8d45e41fa7d866027f0a7fb0e434b670"

RPROVIDES:${PN} += "figlet figlet(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
