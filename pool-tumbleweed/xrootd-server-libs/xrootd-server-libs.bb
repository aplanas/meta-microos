SUMMARY = "Libraries used by XRootD servers"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains libraries used by XRootD servers."
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.1"

RPM_NAME = "xrootd-server-libs-5.6.1-1.1.aarch64.rpm"
RPM_HASH = "c0055a453cd0877fed0f76314f11538689bcaccf5c1b28c7bb4d7ba0f1a08088a62c5cda18915ce00d831d4c14ff6fbf6ed28685ab6adaa9e4a992d49205f1b7"

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
