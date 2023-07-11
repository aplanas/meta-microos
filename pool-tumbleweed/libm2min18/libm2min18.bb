SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7364"

RPM_NAME = "libm2min18-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "5623038c293714b5ac78e104e87e7563713562bfb86ad505d3266e69462bb00477a41d4f9579e326ffaea1f050add4ec4dc5d339d549c9e3805606bff0ab4b26"

RPROVIDES:${PN} += "libm2min.so.18 \
libm2min18"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
