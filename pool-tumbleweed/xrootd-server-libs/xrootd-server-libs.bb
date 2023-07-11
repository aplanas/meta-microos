SUMMARY = "Libraries used by XRootD servers"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains libraries used by XRootD servers."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.5"

RPM_NAME = "xrootd-server-libs-5.5.5-1.1.aarch64.rpm"
RPM_HASH = "7689f99d23f2ef6a173aceb168d11ed157d18648980c745fb1810016525dc97f4f6b5aba36408314ad503f7508c8ef4d76e12eeb1d2bfc5749dd354e3d08d5e5"

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
