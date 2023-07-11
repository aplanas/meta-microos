SUMMARY = "Development files of molequeue"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use molequeue."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "molequeue-devel-0.9.0-3.10.aarch64.rpm"
RPM_HASH = "529dd7ffea581478c6e5ce38a1a7a160fc5015673268ed324bca79b0657e67763298a7e6ccfe8ff1c8c65c5a44fee26488b552a6b936279dad9e49f234a31d4d"

RPROVIDES:${PN} += "cmake-MoleQueue \
molequeue-devel"

RDEPENDS:${PN} += "libqt5-qtbase-devel \
molequeue-libs0"

inherit rpm
