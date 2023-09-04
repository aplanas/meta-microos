SUMMARY = "Haskell lpeg library development files"
DESCRIPTION = "This package provides the Haskell lpeg library development files."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "ghc-lpeg-devel-1.0.4-1.5.aarch64.rpm"
RPM_HASH = "20f42fe288e8cb79f255d4c0c7a999f2186185ca9b25a2252f2109ec43f4bf8b723b476a6710d52440eb849855e4f89fcc7c8a625a3883e55ff06f3bc95374cf"

RPROVIDES:${PN} += "ghc-devel-lpeg-1.0.4-DiPCMqCZ1gDFL4TQ30W98B \
ghc-lpeg-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-lua-2.3.1-IuAZ4Y3Pnt2ACNXikcgl6h \
ghc-lpeg"

inherit rpm
