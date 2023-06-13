SUMMARY = "Haskell bytestring library development files"
DESCRIPTION = "This package provides the Haskell bytestring library development files."
LICENSE = "BSD-3-Clause"

PV = "0.11.4.0"

RPM_NAME = "ghc-bytestring-devel-0.11.4.0-3.1.aarch64.rpm"
RPM_HASH = "8f44ae667ef0e6b56a6d81e6bcd060d61320ebfca5bcb3d1bc98b5a7a42e7bb7a5f1c36ec321d0100562a754b1427536037af6fbe4bcd383578f5d1c82e5e3f3"

RPROVIDES:${PN} += "ghc-bytestring-devel \
ghc-bytestring-devel(aarch-64) \
ghc-bytestring-static \
ghc-bytestring-static(aarch-64) \
ghc-devel(bytestring-0.11.4.0)"

RDEPENDS:${PN} += "ghc-bytestring(aarch-64) \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(ghc-prim-0.9.0) \
ghc-devel(template-haskell-2.19.0.0)"

inherit rpm
