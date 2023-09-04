SUMMARY = "For creating, comparing, parsing and printing Universally Unique Identifiers"
DESCRIPTION = "This library is useful for creating, comparing, parsing and printing \
Universally Unique Identifiers. \
 \
See <http://en.wikipedia.org/wiki/UUID> for the general idea."
LICENSE = "BSD-3-Clause"

PV = "1.3.15"

RPM_NAME = "ghc-uuid-1.3.15-4.9.aarch64.rpm"
RPM_HASH = "9311c1a758f9f84e3283b6cd27a96025e48717ec470bb3562055cc23a2aa04278a64972b3a5f884cd8759873e87d5499058a562e0d512c557395bd6c6009aa0c"

RPROVIDES:${PN} += "ghc-uuid \
libHSuuid-1.3.15-G28WsYmWYhECkJy6K1fo5U-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHScryptohash-md5-0.11.101.0-DA2NKKN1mDy6fcPl6be7xQ-ghc9.4.6.so \
libHScryptohash-sha1-0.11.101.0-6Awf3EmibUqDJxbZJLf3j4-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSentropy-0.4.1.10-J8gEYIp8YzV1E0Yqy7gqyc-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSnetwork-info-0.2.1-EA7QwxKMOIgJxpSbEh9J66-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSrandom-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k-ghc9.4.6.so \
libHSsplitmix-0.1.0.4-2jzLu9hw0mWH5mdbN14y0O-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSuuid-types-1.0.5-34Qd5N8tYIyGW5LtrFWnkV-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
