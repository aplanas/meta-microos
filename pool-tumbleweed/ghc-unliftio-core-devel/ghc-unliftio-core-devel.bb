SUMMARY = "Haskell unliftio-core library development files"
DESCRIPTION = "This package provides the Haskell unliftio-core library development files."
LICENSE = "MIT"

PV = "0.2.1.0"

RPM_NAME = "ghc-unliftio-core-devel-0.2.1.0-1.3.aarch64.rpm"
RPM_HASH = "2ffb7247acec34f71e4442005f073b60e79716df920e3a0abf4dd1f955f11104867d7f8cf947897d03f3a5bcbdf095dc3122afacaeddf6aed5ddc156d523e1f3"

RPROVIDES:${PN} += "ghc-devel-unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj \
ghc-unliftio-core-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-unliftio-core"

inherit rpm
