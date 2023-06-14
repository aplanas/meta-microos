SUMMARY = "Development files for XRootD clients"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains header files and development libraries \
for XRootD client development"
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.4"

RPM_NAME = "xrootd-client-devel-5.5.4-1.1.aarch64.rpm"
RPM_HASH = "1e5f2d850bca3c47e163582da5397ef6f73be71256f5fe0f9f477b2ce7987ee531e4269ac009cdff633bfdb132a099022f54a945c026dcd001be11fac60528bb"

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
