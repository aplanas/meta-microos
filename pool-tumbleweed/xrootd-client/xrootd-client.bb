SUMMARY = "XRootD command line client tools"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains the command line tools used to \
communicate with XRootD servers."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.5"

RPM_NAME = "xrootd-client-5.5.5-1.1.aarch64.rpm"
RPM_HASH = "72fbcd76866f9fcb22f26565b69d31481553a04cfe23910ecbc9a84f3071507c04c5feb0ea4691f4c0c7937eceef402335825611ef317d93dc09ac07053769e7"

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
