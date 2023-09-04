SUMMARY = "Haskell hslua-module-system profiling library"
DESCRIPTION = "This package provides the Haskell hslua-module-system profiling library."
LICENSE = "MIT"

PV = "1.1.0.1"

RPM_NAME = "ghc-hslua-module-system-prof-1.1.0.1-1.3.aarch64.rpm"
RPM_HASH = "0567ac7027867a3d4fff32a2c819b243a6d86631022f418d1a7436f9907b709144596c6e5c64e617d154161c54b0cd0a93d9d0afda7efb36b6ca3195f2275ef1"

RPROVIDES:${PN} += "ghc-hslua-module-system-prof \
ghc-prof-hslua-module-system-1.1.0.1-7cwTC3xiKRBJkCLVU1z04u"

RDEPENDS:${PN} += "ghc-hslua-module-system-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-prof-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-prof-hslua-packaging-2.3.0-4zNLfL9evW33fw96RBrzdD \
ghc-prof-temporary-1.3-Ezu2TwUgvSS2TpaVIHxXuR \
ghc-prof-text-2.0.2"

inherit rpm
