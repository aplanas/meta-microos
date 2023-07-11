SUMMARY = "Development files for libcorrect"
DESCRIPTION = "libcorrect is a library for Forward Error Correction. By using libcorrect, \
extra redundancy can be encoded into a packet of data and then be sent \
across a lossy channel. When the packet is received, it can be decoded to \
recover the original, pre-encoded data. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcorrect."
LICENSE = "BSD-3-Clause"

PV = "0.0.0+git.20180109"

RPM_NAME = "libcorrect-devel-0.0.0+git.20180109-3.9.aarch64.rpm"
RPM_HASH = "4d573f00b43102acb9dd970cdb73d92e8b6c72a4f503c6cfafb9e028ebb6089df1fe793343feccbac158f826416ae450870cbe5eff8589e1fd53d2c3ea30fd49"

RPROVIDES:${PN} += "libcorrect-devel \
pkgconfig-libcorrect"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcorrect0-0-0"

inherit rpm
