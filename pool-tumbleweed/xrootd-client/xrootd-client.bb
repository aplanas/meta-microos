SUMMARY = "XRootD command line client tools"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains the command line tools used to \
communicate with XRootD servers."
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.1"

RPM_NAME = "xrootd-client-5.6.1-1.1.aarch64.rpm"
RPM_HASH = "3920257eabb4b9b3294cae62c459f35d8d34f5c7c45c7de39bfc2984e65ee69ae39a7311e11310746ad893970a3b62e58849d7c629c372040cf1615f41dd75f1"

RPROVIDES:${PN} += "xrootd-cl \
xrootd-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libXrdAppUtils.so.2 \
libXrdCl.so.3 \
libXrdCrypto.so.2 \
libXrdPosix.so.3 \
libXrdUtils.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libz.so.1 \
xrootd-client-libs \
xrootd-libs"

inherit rpm
