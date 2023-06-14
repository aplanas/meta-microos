SUMMARY = "XRootD core libraries"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains libraries used by the XRootD servers and \
clients."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.4"

RPM_NAME = "xrootd-libs-5.5.4-1.1.aarch64.rpm"
RPM_HASH = "1bdce4f46b200eb933a2d121b1c29aecc4d3d27b5a80df4e0aff30bfaf6b86ce0ec518c5c739076839a243ca3f7f32f4932fbd11b1b51e360abe60ad352b0709"

RPROVIDES:${PN} += "libXrdAppUtils.so.2 \
libXrdCksCalczcrc32-5.so \
libXrdClProxyPlugin-5.so \
libXrdCmsRedirectLocal-5.so \
libXrdCrypto.so.2 \
libXrdCryptoLite.so.2 \
libXrdCryptossl-5.so \
libXrdHttpUtils.so.2 \
libXrdSec-5.so \
libXrdSecProt-5.so \
libXrdSecgsi-5.so \
libXrdSecgsiAUTHZVO-5.so \
libXrdSecgsiGMAPDN-5.so \
libXrdSeckrb5-5.so \
libXrdSecpwd-5.so \
libXrdSecsss-5.so \
libXrdSecunix-5.so \
libXrdSecztn-5.so \
libXrdUtils.so.3 \
libXrdXml.so.3 \
xrootd-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
glibc \
ld-linux-aarch64.so.1 \
libXrdCl.so.3 \
libXrdServer.so.3 \
libc.so.6 \
libcom-err.so.2 \
libcrypt.so.1 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkrb5.so.3 \
libssl.so.3 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
