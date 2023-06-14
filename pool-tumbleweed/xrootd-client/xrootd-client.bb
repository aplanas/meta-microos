SUMMARY = "XRootD command line client tools"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains the command line tools used to \
communicate with XRootD servers."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.4"

RPM_NAME = "xrootd-client-5.5.4-1.1.aarch64.rpm"
RPM_HASH = "68a8bb646b0092a514b7a9de74d646441ea3c9f0c6c0e0602a2b6ac7ac037b86e346df041ec1df34f1ceb5f9b6e009d2f290e484380f9f131630410d02645f6c"

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
