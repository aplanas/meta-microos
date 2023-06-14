SUMMARY = "XRootD (eXtended Root Daemon) server"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
The XRootD (eXtended Root Daemon) server binaries."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.4"

RPM_NAME = "xrootd-server-5.5.4-1.1.aarch64.rpm"
RPM_HASH = "c70bca3ba72311033da314443bea6cea1b6cb1935d62aaec43ffc7357546393420da135e5435f0d179c84f45f0e28c3db8d8159d820e90cef7fe8426b36e0270"

RPROVIDES:${PN} += "config-xrootd-server \
group-xrootd \
perl-XrdCmsNotify \
user-xrootd \
xrootd-server"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
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
