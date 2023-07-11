SUMMARY = "Development files for XRootD clients"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains header files and development libraries \
for XRootD client development"
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.5"

RPM_NAME = "xrootd-client-devel-5.5.5-1.1.aarch64.rpm"
RPM_HASH = "dda07720607471d5f0b9a60ff7bc299a3305b546c0a369ac6052cf49c2088c49c677102075325a0680d5edd611a974e5487a2a56568a0ea988bb097640188fd9"

RPROVIDES:${PN} += "xrootd-cl-devel \
xrootd-client-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libXrdCrypto.so.2 \
libXrdUtils.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
xrootd-client-libs \
xrootd-libs-devel"

inherit rpm
