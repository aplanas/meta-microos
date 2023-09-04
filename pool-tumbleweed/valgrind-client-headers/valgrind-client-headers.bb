SUMMARY = "Header files for for Valgrind"
DESCRIPTION = "This package contains the BSD-style licensed Valgrind header \
files for inclusion into regular programs. The program can \
detect if it is running under Valgrind and interact with the \
Valgrind core and plugins."
LICENSE = "GFDL-1.2-only & GPL-2.0-or-later"

PV = "3.21.0"

RPM_NAME = "valgrind-client-headers-3.21.0-2.1.noarch.rpm"
RPM_HASH = "bf6a28e9d853380bb0267a16aa73154db503585fa3d09f3c23e18eea8b1006ae9bb16d03cc7c14dc650f5a21c4c3b14e4f3f63c143da8a5238d693ded6bba6f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "valgrind-client-headers \
valgrind-devel-/usr/include/valgrind/valgrind.h"

RDEPENDS:${PN} += ""

inherit rpm
