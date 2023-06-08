SUMMARY = "Header files and libraries for Enca development"
DESCRIPTION = "The enca-devel package contains the static libraries and header files \
for writing programs using the Extremely Naive Charset Analyser library, \
and its API documentation. \
 \
Install enca-devel if you are going to create applications using the Enca \
library."
LICENSE = "GPL-2.0-only"

PV = "1.19"

RPM_NAME = "enca-devel-1.19-2.4.aarch64.rpm"
RPM_HASH = "433015f08ac03b632c524239455569888167a9219bc190c72ca3fd8e4b6da33760b6753d79a85fd8e890bfff295982b85ac62ca1c7ee2d93d95bda31b17598c4"

RPROVIDES:${PN} += "enca-devel enca-devel(aarch-64) pkgconfig(enca)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libenca0"

inherit rpm
