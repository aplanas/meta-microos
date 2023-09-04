SUMMARY = "Haskell old-time profiling library"
DESCRIPTION = "This package provides the Haskell old-time profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.0.3"

RPM_NAME = "ghc-old-time-prof-1.1.0.3-13.4.aarch64.rpm"
RPM_HASH = "9761969ffdad9cedadbf389b7a07ea152ba368e105d79df6edd6d0939acebc3db5a6b53b734860c44c1c3205c950bf589aebbaf18622955d229fb24b25bf20ba"

RPROVIDES:${PN} += "ghc-old-time-prof \
ghc-prof-old-time-1.1.0.3-EO4BkAubfN4CLCS9qF8OKw"

RDEPENDS:${PN} += "ghc-old-time-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-old-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk"

inherit rpm
