SUMMARY = "Haskell exceptions profiling library"
DESCRIPTION = "This package provides the Haskell exceptions profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10.5"

RPM_NAME = "ghc-exceptions-prof-0.10.5-3.1.aarch64.rpm"
RPM_HASH = "c4d69399bb9ffe3add41e3cd9a7dd6e8f110647655e1ce4fb5945fdded6c32d824630f7fc5cf84fcc7d4bafb22e6c03bde02b988e4889f09e326e82b3cc30f14"

RPROVIDES:${PN} += "ghc-exceptions-prof ghc-exceptions-prof(aarch-64) ghc-prof(exceptions-0.10.5)"
RDEPENDS:${PN} += "ghc-exceptions-devel(aarch-64) ghc-prof(base-4.17.1.0) ghc-prof(mtl-2.2.2) ghc-prof(stm-2.5.1.0) ghc-prof(template-haskell-2.19.0.0) ghc-prof(transformers-0.5.6.2)"

inherit rpm
