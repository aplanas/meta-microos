SUMMARY = "XRootD core libraries"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains libraries used by the XRootD servers and \
clients."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.5"

RPM_NAME = "xrootd-libs-5.5.5-1.1.aarch64.rpm"
RPM_HASH = "ead1cadf06a6dc39affd3959c07182611ca8c01be477d3405142cc16b87f090a311c4221e3b90dea830bf39ebd943af3bf5435ad4cdd1adb12a2b6c6181447f7"

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
