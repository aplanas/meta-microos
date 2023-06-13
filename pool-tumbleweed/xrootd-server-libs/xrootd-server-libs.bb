SUMMARY = "Libraries used by XRootD servers"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains libraries used by XRootD servers."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.4"

RPM_NAME = "xrootd-server-libs-5.5.4-1.1.aarch64.rpm"
RPM_HASH = "9e42b2af903d89973fe3c9984aa0f7b3e40461d2ee56562e3f67d8f3678408c6a679e3ff8c50487996a0a6fdd968be2a855c4e653006d0cc7b180da609c8a98a"

RPROVIDES:${PN} += "libXrdBlacklistDecision-5.so()(64bit) \
libXrdBwm-5.so()(64bit) \
libXrdClRecorder-5.so()(64bit) \
libXrdHttp-5.so()(64bit) \
libXrdN2No2p-5.so()(64bit) \
libXrdOfsPrepGPI-5.so()(64bit) \
libXrdOssCsi-5.so()(64bit) \
libXrdOssSIgpfsT-5.so()(64bit) \
libXrdPfc-5.so()(64bit) \
libXrdPss-5.so()(64bit) \
libXrdServer.so.3()(64bit) \
libXrdSsi-5.so()(64bit) \
libXrdSsiLib.so.2()(64bit) \
libXrdSsiLog-5.so()(64bit) \
libXrdSsiShMap.so.2()(64bit) \
libXrdThrottle-5.so()(64bit) \
libXrdXrootd-5.so()(64bit) \
xrootd-server-libs \
xrootd-server-libs(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libXrdCl.so.3()(64bit) \
libXrdHttpUtils.so.2()(64bit) \
libXrdPosix.so.3()(64bit) \
libXrdUtils.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit) \
logrotate \
systemd \
xrootd-client-libs \
xrootd-libs"

inherit rpm
