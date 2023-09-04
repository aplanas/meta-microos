SUMMARY = "Haskell base-unicode-symbols profiling library"
DESCRIPTION = "This package provides the Haskell base-unicode-symbols profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.4.2"

RPM_NAME = "ghc-base-unicode-symbols-prof-0.2.4.2-1.3.aarch64.rpm"
RPM_HASH = "a6d85a0da13d7ce10ee16843ea82cd9ec4e8f8b82a10ce4174e196b90a446196f8e08cffa5ba28790e00ac3838aa3f34edefa6880088e5c820402e848282e44d"

RPROVIDES:${PN} += "ghc-base-unicode-symbols-prof \
ghc-prof-base-unicode-symbols-0.2.4.2-AsBlETXXS2UHsp6FZL7O0P"

RDEPENDS:${PN} += "ghc-base-unicode-symbols-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
