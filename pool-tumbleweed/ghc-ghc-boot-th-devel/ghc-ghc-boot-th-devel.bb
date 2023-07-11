SUMMARY = "Haskell ghc-boot-th library development files"
DESCRIPTION = "This package provides the Haskell ghc-boot-th library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-boot-th-devel-9.4.5-3.2.aarch64.rpm"
RPM_HASH = "1fc5a66f99a84850363be2bba9d929aea697678fd73ec515b45889b6544680b056073615775c55471143d1b737124ddd0294aa371ee57468d149f4ae22f2a97e"

RPROVIDES:${PN} += "ghc-devel-ghc-boot-th-9.4.5 \
ghc-ghc-boot-th-devel \
ghc-ghc-boot-th-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-ghc-boot-th"

inherit rpm
