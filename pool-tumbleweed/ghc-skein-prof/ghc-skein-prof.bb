SUMMARY = "Haskell skein profiling library"
DESCRIPTION = "This package provides the Haskell skein profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.9.4"

RPM_NAME = "ghc-skein-prof-1.0.9.4-4.5.aarch64.rpm"
RPM_HASH = "8c9018321638b48b2b0808b4b1b60371d2ce0dc0d30bce68b3bb00b3d20d88bac1f3b1c1cfcad5f463c20182932affa186ae49a687488eb712998c1773d29ccf"

RPROVIDES:${PN} += "ghc-prof-skein-1.0.9.4-HfR9tmKKFFp5G94XUHSnaw \
ghc-skein-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-cereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I \
ghc-prof-crypto-api-0.13.3-2rX3thRbGDW3ZR7H62fg4Z \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-skein-devel"

inherit rpm
