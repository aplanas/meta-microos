SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-m68k-gcc7-icecream-backend-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "071ff51c9b512c19c23d263b472975028d2570ac6c5bcd0d304ee391d438e0fbcb360aab8e5d4ab1510513f18232bcce6e2abb1fa167bfa90431ac88afd6870d"

RPROVIDES:${PN} += "cross-m68k-gcc7-icecream-backend cross-m68k-gcc7-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
