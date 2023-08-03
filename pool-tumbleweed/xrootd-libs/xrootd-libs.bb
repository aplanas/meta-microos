SUMMARY = "XRootD core libraries"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains libraries used by the XRootD servers and \
clients."
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.1"

RPM_NAME = "xrootd-libs-5.6.1-1.1.aarch64.rpm"
RPM_HASH = "d4f067be07e2629b26eb4978e5a516509c004b64aaaf0634c0cf9f9062a7dccffa13feb638f5f3ffde3c7be0f5eb6d6525f4f4a143360abcf7538ba324e4d1b2"

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
