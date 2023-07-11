SUMMARY = "Development files for fstrm, a Frame Streams implementation in C"
DESCRIPTION = "This is fstrm, a C implementation of the Frame Streams data transport protocol. \
 \
This packages holds the development files."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "fstrm-devel-0.6.1-1.6.aarch64.rpm"
RPM_HASH = "470bfaa9b910c5a05559023a4ce8843fe453265c6938ed209c6723afcdc626f48268146aae5bcf84e0784d960da19120664f603529d9c4a830dce2cc3bb02dbf"

RPROVIDES:${PN} += "fstrm-devel \
libfstrm-devel \
pkgconfig-libfstrm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfstrm0"

inherit rpm
