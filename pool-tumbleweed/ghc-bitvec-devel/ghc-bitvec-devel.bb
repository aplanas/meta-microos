SUMMARY = "Haskell bitvec library development files"
DESCRIPTION = "This package provides the Haskell bitvec library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.4.0"

RPM_NAME = "ghc-bitvec-devel-1.1.4.0-1.6.aarch64.rpm"
RPM_HASH = "022db5b05f4b907f1c7b0c85ad16957acc60eaa8d596808e92ebd9b432133006bdc6e328ae40474b4e72b0d457518a5414745ec50e4aeabbe002d1e8e556f690"

RPROVIDES:${PN} += "ghc-bitvec-devel \
ghc-devel-bitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-bitvec \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-bignum-1.3 \
ghc-devel-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
