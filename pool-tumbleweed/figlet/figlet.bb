SUMMARY = "Tool for Creating Cool ASCII-Art Signatures"
DESCRIPTION = "FIGlet can create characters in many different styles and can kern and \
'smush' these characters together in various ways. FIGlet output is \
generally reminiscent of the sort of 'signatures' many people like to \
put at the end of e-mail and UseNet messages."
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "figlet-2.2.5-3.1.aarch64.rpm"
RPM_HASH = "06b07a67f2cd5275cd4266d72eaabbbbcd589916c1b4ea3c3b4ef1c8c88542ea7fca2224ab4c4b880846d2876d0dee61ac3d19f733d760e0e99b78e0dde02437"

RPROVIDES:${PN} += "figlet \
figlet(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
