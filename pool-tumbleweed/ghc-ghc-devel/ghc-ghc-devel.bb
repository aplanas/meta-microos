SUMMARY = "Haskell ghc library development files"
DESCRIPTION = "This package provides the Haskell ghc library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-ghc-devel-9.4.6-1.1.aarch64.rpm"
RPM_HASH = "8770e04e76dad01b2c3a87d97ff0e93a5607fcf3f74c4270ba9ed4946153eaca1095ff116dba8df2c572d158d1248c5cc889714294e6f54bebe80c15e7999226"

RPROVIDES:${PN} += "ghc-devel-ghc-9.4.6 \
ghc-ghc-devel \
ghc-ghc-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-ghc-boot-9.4.6 \
ghc-devel-ghc-heap-9.4.6 \
ghc-devel-ghci-9.4.6 \
ghc-devel-hpc-0.6.1.0 \
ghc-devel-process-1.6.17.0 \
ghc-devel-stm-2.5.1.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-terminfo-0.4.1.5 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-ghc"

inherit rpm
