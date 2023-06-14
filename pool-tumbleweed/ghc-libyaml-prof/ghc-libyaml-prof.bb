SUMMARY = "Haskell libyaml profiling library"
DESCRIPTION = "This package provides the Haskell libyaml profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-libyaml-prof-0.1.2-6.3.aarch64.rpm"
RPM_HASH = "1cfb8735d275071adf36ced153fe4896f9ca500361a013919d5dd37f41ab941e497a5caccf1d0edc1b6ca1e7f07a11120fd937f005dc6a96feb9ffe76db84ae8"

RPROVIDES:${PN} += "ghc-libyaml-prof \
ghc-prof-libyaml-0.1.2-HGo47aMnIYAKZUBwKE0axw"

RDEPENDS:${PN} += "ghc-libyaml-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2 \
ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv"

inherit rpm
