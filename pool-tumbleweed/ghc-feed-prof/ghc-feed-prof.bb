SUMMARY = "Haskell feed profiling library"
DESCRIPTION = "This package provides the Haskell feed profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.1"

RPM_NAME = "ghc-feed-prof-1.3.2.1-4.4.aarch64.rpm"
RPM_HASH = "42585744068a08ab57104bcfaf0636dbd1fc8f1c681522d02e61fe4d31e89cdd90b2395895daa31e89fa27fd08da366cd0561addc59e45674bdf6e01484c5a73"

RPROVIDES:${PN} += "ghc-feed-prof \
ghc-prof-feed-1.3.2.1-16TO18BMpDvLQty4vYIIwy"

RDEPENDS:${PN} += "ghc-feed-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-base-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-old-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk \
ghc-prof-old-time-1.1.0.3-EO4BkAubfN4CLCS9qF8OKw \
ghc-prof-safe-0.3.19-9uHvZjuyLiR13wOGSONZxX \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-time-locale-compat-0.1.1.5-9kgo2YphD9418bVnFGy98u \
ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-prof-xml-conduit-1.9.1.3-2cOMN3SNzhLD8DxEiNBrwq \
ghc-prof-xml-types-0.3.8-8dFL1RqlGPRJfvDIVn7kl6"

inherit rpm
