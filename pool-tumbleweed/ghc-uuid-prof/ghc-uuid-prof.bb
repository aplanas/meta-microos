SUMMARY = "Haskell uuid profiling library"
DESCRIPTION = "This package provides the Haskell uuid profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.15"

RPM_NAME = "ghc-uuid-prof-1.3.15-4.9.aarch64.rpm"
RPM_HASH = "cc13d69758a3ed8abd52597241713b908555329c1bc5943c2d37b1d5a3a8ac6d4a2b836a0b3741c1310a1b8085dba64d974d54a9fa4637420eabd537d805bbd8"

RPROVIDES:${PN} += "ghc-prof-uuid-1.3.15-G28WsYmWYhECkJy6K1fo5U \
ghc-uuid-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-cryptohash-md5-0.11.101.0-DA2NKKN1mDy6fcPl6be7xQ \
ghc-prof-cryptohash-sha1-0.11.101.0-6Awf3EmibUqDJxbZJLf3j4 \
ghc-prof-entropy-0.4.1.10-J8gEYIp8YzV1E0Yqy7gqyc \
ghc-prof-network-info-0.2.1-EA7QwxKMOIgJxpSbEh9J66 \
ghc-prof-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-uuid-types-1.0.5-34Qd5N8tYIyGW5LtrFWnkV \
ghc-uuid-devel"

inherit rpm
