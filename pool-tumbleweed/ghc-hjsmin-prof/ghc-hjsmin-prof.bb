SUMMARY = "Haskell hjsmin profiling library"
DESCRIPTION = "This package provides the Haskell hjsmin profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-hjsmin-prof-0.2.1-1.7.aarch64.rpm"
RPM_HASH = "a36b5503f4c26dd8efa83ca53a26b5a75334e751a853007f65356c2c47727891df117991e34164653583294893b70f652df905d1ecf66d9c6e0e76f69d34c7cf"

RPROVIDES:${PN} += "ghc-hjsmin-prof \
ghc-prof-hjsmin-0.2.1-1Nqa77EAma94x2VWIbRoKX"

RDEPENDS:${PN} += "ghc-hjsmin-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-language-javascript-0.7.1.0-LEIqziehkytABOWYmhOylg \
ghc-prof-text-2.0.2"

inherit rpm
