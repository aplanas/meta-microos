SUMMARY = "Libraries used by XRootD servers"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains libraries used by XRootD servers."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.4"

RPM_NAME = "xrootd-server-libs-5.5.4-1.1.aarch64.rpm"
RPM_HASH = "9e42b2af903d89973fe3c9984aa0f7b3e40461d2ee56562e3f67d8f3678408c6a679e3ff8c50487996a0a6fdd968be2a855c4e653006d0cc7b180da609c8a98a"

RPROVIDES:${PN} += "libXrdBlacklistDecision-5.so \
libXrdBwm-5.so \
libXrdClRecorder-5.so \
libXrdHttp-5.so \
libXrdN2No2p-5.so \
libXrdOfsPrepGPI-5.so \
libXrdOssCsi-5.so \
libXrdOssSIgpfsT-5.so \
libXrdPfc-5.so \
libXrdPss-5.so \
libXrdServer.so.3 \
libXrdSsi-5.so \
libXrdSsiLib.so.2 \
libXrdSsiLog-5.so \
libXrdSsiShMap.so.2 \
libXrdThrottle-5.so \
libXrdXrootd-5.so \
xrootd-server-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libXrdCl.so.3 \
libXrdHttpUtils.so.2 \
libXrdPosix.so.3 \
libXrdUtils.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1 \
logrotate \
systemd \
xrootd-client-libs \
xrootd-libs"

inherit rpm
