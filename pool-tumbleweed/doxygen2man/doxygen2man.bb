SUMMARY = "tool to generate man pages from Doxygen XML files"
DESCRIPTION = "The doxygen2man package contains the doxygen2man utility."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.7+20230607.06c8641"

RPM_NAME = "doxygen2man-2.0.7+20230607.06c8641-1.1.aarch64.rpm"
RPM_HASH = "6dcd6a462a87174c936dff93ccc29c4d8f1bdb641b1b1de11cdcb0735941355a8f711108b1153f8a28b4d85ab35de6fb61cf56886154a32c0033550c8463d38a"

RPROVIDES:${PN} += "doxygen2man"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libqb.so.100 \
libqb100 \
libxml2.so.2"

inherit rpm
