SUMMARY = "XRootD (eXtended Root Daemon) server"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
The XRootD (eXtended Root Daemon) server binaries."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.5"

RPM_NAME = "xrootd-server-5.5.5-1.1.aarch64.rpm"
RPM_HASH = "befc8ebc086e6a2ae793d8659dd550fc750a8a318c822ccad2210edbd328ab383d5d4af9b98cd33d8c0acbd91c60b1daf2e574dca7b212fb6216ceb81f58c7ec"

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
