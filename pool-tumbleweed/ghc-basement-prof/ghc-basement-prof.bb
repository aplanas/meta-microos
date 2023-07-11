SUMMARY = "Haskell basement profiling library"
DESCRIPTION = "This package provides the Haskell basement profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.16"

RPM_NAME = "ghc-basement-prof-0.0.16-1.3.aarch64.rpm"
RPM_HASH = "0a2f13c1a1f324f9eceaad6f18f96797897d330e1bdbbabc405ca763b2a585c76b0e94ef636a972052eed55a4a1232745c2545f6417b4f803c3063d04e025151"

RPROVIDES:${PN} += "ghc-basement-prof \
ghc-prof-basement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn"

RDEPENDS:${PN} += "ghc-basement-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-ghc-prim-0.9.0"

inherit rpm
