SUMMARY = "Haskell ghc-lib-parser-ex library development files"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser-ex library development \
files."
LICENSE = "BSD-3-Clause"

PV = "9.4.0.0"

RPM_NAME = "ghc-ghc-lib-parser-ex-devel-9.4.0.0-1.6.aarch64.rpm"
RPM_HASH = "2093bd59d81015b6343389fc80021cf1c362bd2d97abf4acb1d4d66d5cac1eed32a70d1ef74712b1dbb1103f71c2e0618c95a1f2bbf9fec7a959363af643e06e"

RPROVIDES:${PN} += "ghc-devel-ghc-lib-parser-ex-9.4.0.0-csIofWAAh3CX4OvchqGS5 \
ghc-ghc-lib-parser-ex-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-ghc-lib-parser-9.4.5.20230430-3l319oISrwg5O8XOrKFn5M \
ghc-devel-uniplate-1.6.13-3GboCmnxCZ4BmbYwVaL4sN \
ghc-ghc-lib-parser-ex"

inherit rpm
