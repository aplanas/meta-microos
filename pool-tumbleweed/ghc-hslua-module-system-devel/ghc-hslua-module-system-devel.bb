SUMMARY = "Haskell hslua-module-system library development files"
DESCRIPTION = "This package provides the Haskell hslua-module-system library development \
files."
LICENSE = "MIT"

PV = "1.1.0.1"

RPM_NAME = "ghc-hslua-module-system-devel-1.1.0.1-1.3.aarch64.rpm"
RPM_HASH = "da92939af24472c0f12795774dac4b365dacc1490b9297de072ba2f084c46980da119a1b45f988772fd9126ec9686d9ce5d4e0da5a48d1e9017ba85e963364a3"

RPROVIDES:${PN} += "ghc-devel-hslua-module-system-1.1.0.1-7cwTC3xiKRBJkCLVU1z04u \
ghc-hslua-module-system-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-devel-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-devel-hslua-packaging-2.3.0-4zNLfL9evW33fw96RBrzdD \
ghc-devel-temporary-1.3-Ezu2TwUgvSS2TpaVIHxXuR \
ghc-devel-text-2.0.2 \
ghc-hslua-module-system"

inherit rpm
