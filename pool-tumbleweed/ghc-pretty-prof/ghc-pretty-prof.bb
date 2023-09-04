SUMMARY = "Haskell pretty profiling library"
DESCRIPTION = "This package provides the Haskell pretty profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.3.6"

RPM_NAME = "ghc-pretty-prof-1.1.3.6-1.1.aarch64.rpm"
RPM_HASH = "03dac1d3e06dcdbbaf29783756c254a59c4635474eec7f80030b21098c9659fd423441ce1c668fa7cd3b1a6751b58f0b78cf072afca08de133d9111c747ae3be"

RPROVIDES:${PN} += "ghc-pretty-prof \
ghc-prof-pretty-1.1.3.6"

RDEPENDS:${PN} += "ghc-pretty-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.1"

inherit rpm
