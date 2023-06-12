SUMMARY = "Haskell mmorph profiling library"
DESCRIPTION = "This package provides the Haskell mmorph profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "ghc-mmorph-prof-1.2.0-4.2.aarch64.rpm"
RPM_HASH = "ff25298a5517457defe10a53d2920bea128df2e4fe90b7c0660b572c6a44eafcd4d17aafc36de5b3540634def8525c01f7d8295eb297181dd36e41a0434f3cb7"

RPROVIDES:${PN} += "ghc-mmorph-prof \
ghc-mmorph-prof(aarch-64) \
ghc-prof(mmorph-1.2.0-4Mt4o3YW9h63uaZAnM2RZC)"
RDEPENDS:${PN} += "ghc-mmorph-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(mtl-2.2.2) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd)"

inherit rpm
