SUMMARY = "Haskell template-haskell library development files"
DESCRIPTION = "This package provides the Haskell template-haskell library development files."
LICENSE = "BSD-3-Clause"

PV = "2.19.0.0"

RPM_NAME = "ghc-template-haskell-devel-2.19.0.0-3.1.aarch64.rpm"
RPM_HASH = "3273ba6fec4e72e78edcbede215052adb3221c9af3bc72f49b428293d9a53d52d1094f288c7dc9038718679b3cdc2dd6860e93da38a48ec99baad849e83fa2f5"

RPROVIDES:${PN} += "ghc-devel(template-haskell-2.19.0.0) \
ghc-template-haskell-devel \
ghc-template-haskell-devel(aarch-64) \
ghc-template-haskell-static \
ghc-template-haskell-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(ghc-boot-th-9.4.5) \
ghc-devel(ghc-prim-0.9.0) \
ghc-devel(pretty-1.1.3.6) \
ghc-template-haskell(aarch-64)"

inherit rpm
