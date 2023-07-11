SUMMARY = "Python bindings for xrootd"
DESCRIPTION = "This package provides python3 bindings for xrootd."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.5"

RPM_NAME = "python311-xrootd-5.5.5-1.1.aarch64.rpm"
RPM_HASH = "2501ce77c874f721e09dfa175b7cc12113d198fa44e8de3bee8f4234e61b9edbb039172d11fb256c309724cdf5ea5eafc61d1e163641f2b8a6706a4a03773773"

RPROVIDES:${PN} += "libXrdAppUtils.so.2 \
libXrdCl.so.3 \
libXrdClProxyPlugin-5.so \
libXrdClRecorder-5.so \
libXrdCrypto.so.2 \
libXrdCryptoLite.so.2 \
libXrdCryptossl-5.so \
libXrdPosix.so.3 \
libXrdPosixPreload.so.2 \
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
python3-xrootd \
python3.11dist-xrootd \
python311-xrootd \
python3dist-xrootd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libcrypt.so.1 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkrb5.so.3 \
libssl.so.3 \
libstdc++.so.6 \
libuuid.so.1 \
libxml2.so.2 \
libz.so.1 \
python-abi"

inherit rpm
