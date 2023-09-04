SUMMARY = "Haskell uuid library development files"
DESCRIPTION = "This package provides the Haskell uuid library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.15"

RPM_NAME = "ghc-uuid-devel-1.3.15-4.9.aarch64.rpm"
RPM_HASH = "dbd940500a8ae82c9717be3e3801af62500ef264c6f1c7211e6391035e07bc6d552e90dbd77ec4819f0fe27adcc79c2464e88f0c05dfd8fe20d25609e1ce659e"

RPROVIDES:${PN} += "ghc-devel-uuid-1.3.15-G28WsYmWYhECkJy6K1fo5U \
ghc-uuid-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-cryptohash-md5-0.11.101.0-DA2NKKN1mDy6fcPl6be7xQ \
ghc-devel-cryptohash-sha1-0.11.101.0-6Awf3EmibUqDJxbZJLf3j4 \
ghc-devel-entropy-0.4.1.10-J8gEYIp8YzV1E0Yqy7gqyc \
ghc-devel-network-info-0.2.1-EA7QwxKMOIgJxpSbEh9J66 \
ghc-devel-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-uuid-types-1.0.5-34Qd5N8tYIyGW5LtrFWnkV \
ghc-uuid"

inherit rpm
