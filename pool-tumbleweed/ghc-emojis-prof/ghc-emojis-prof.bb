SUMMARY = "Haskell emojis profiling library"
DESCRIPTION = "This package provides the Haskell emojis profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-emojis-prof-0.1.3-1.2.aarch64.rpm"
RPM_HASH = "e5e4636de8d4ed6529ab6485e82a73a04b7e87fb9009d6a93c133208bdb27f796f066cb33e227b868d4d159229de06b3c7310ce7e99b28f963b2deffe862cb8c"

RPROVIDES:${PN} += "ghc-emojis-prof \
ghc-prof-emojis-0.1.3-7wpttN9DVlcBjh9pp4W5jK"

RDEPENDS:${PN} += "ghc-emojis-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-text-2.0.2"

inherit rpm
