SUMMARY = "The IUPAC International Chemical Identifier"
DESCRIPTION = "The IUPAC International Chemical Identifier (InChI) is a non-proprietary \
identifier for chemical substances that can be used in printed and \
electronic data sources thus enabling easier linking of diverse data \
compilations. It was developed under IUPAC Project 2000-025-1-800 during \
the period 2000-2004. Details of the project and the history of its \
progress are available from the project web site. \
 \
This package contains the command line conversion utility."
LICENSE = "LGPL-2.0-or-later"

PV = "1.06"

RPM_NAME = "inchi-1.06-2.3.aarch64.rpm"
RPM_HASH = "7b8c9d705e0f7485b9eec8ae577dc9895adb447b1b8509d7dc5ea617591ea56196bb0a4ae4937d3124120ac30a16eb0f7912818ceebd5e647e340d31c336998e"

RPROVIDES:${PN} += "inchi \
inchi(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
