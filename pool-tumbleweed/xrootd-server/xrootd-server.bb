SUMMARY = "XRootD (eXtended Root Daemon) server"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
The XRootD (eXtended Root Daemon) server binaries."
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.1"

RPM_NAME = "xrootd-server-5.6.1-1.1.aarch64.rpm"
RPM_HASH = "8308203303bd334b3cd03e3a15d8b04ead95b9227b7f54748a14b57cc68ba0a1325d3039992ce03195cbce3d72f713236469c3c323fe0fda83a4b2a5adb391b7"

RPROVIDES:${PN} += "config-xrootd-server \
group-xrootd \
perl-XrdCmsNotify \
user-xrootd \
xrootd-server"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libXrdAppUtils.so.2 \
libXrdCl.so.3 \
libXrdCrypto.so.2 \
libXrdServer.so.3 \
libXrdUtils.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libreadline.so.8 \
libstdc++.so.6 \
sysuser-shadow \
xrootd-client-libs \
xrootd-libs \
xrootd-server-libs"

inherit rpm
