SUMMARY = "Header files for for Valgrind"
DESCRIPTION = "This package contains the BSD-style licensed Valgrind header \
files for inclusion into regular programs. The program can \
detect if it is running under Valgrind and interact with the \
Valgrind core and plugins."
LICENSE = "GFDL-1.2-only & GPL-2.0-or-later"

PV = "3.21.0"

RPM_NAME = "valgrind-client-headers-3.21.0-1.1.noarch.rpm"
RPM_HASH = "84da07b16465918eb6d62c8fa514d4a159c626d3acf032bedcf57749c1b90e498a9e83cc9f81b1b3f984565c9a5041cf84d4e667ead4e685dc0e398cc212dfef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "valgrind-client-headers \
valgrind-devel-/usr/include/valgrind/valgrind.h"

RDEPENDS:${PN} += ""

inherit rpm
