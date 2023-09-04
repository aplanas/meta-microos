SUMMARY = "Haskell feed library development files"
DESCRIPTION = "This package provides the Haskell feed library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.1"

RPM_NAME = "ghc-feed-devel-1.3.2.1-4.3.aarch64.rpm"
RPM_HASH = "06abbed36239bb14549696cfb0100d7315fb319827e8a2e243ecae74d165e07b356992b49acfe72dd127bfa6c74fad51c9b6db6a2e5ba7df53f87a370d8a6ce1"

RPROVIDES:${PN} += "ghc-devel-feed-1.3.2.1-BjaO6WIBq79DkKCt2cylSO \
ghc-feed-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-old-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk \
ghc-devel-old-time-1.1.0.3-EO4BkAubfN4CLCS9qF8OKw \
ghc-devel-safe-0.3.19-9uHvZjuyLiR13wOGSONZxX \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-time-locale-compat-0.1.1.5-9kgo2YphD9418bVnFGy98u \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-devel-xml-conduit-1.9.1.3-DDoR4rlzTH6QSHmFsTVd9 \
ghc-devel-xml-types-0.3.8-8dFL1RqlGPRJfvDIVn7kl6 \
ghc-feed"

inherit rpm
