SUMMARY = "Haskell text-zipper library development files"
DESCRIPTION = "This package provides the Haskell text-zipper library development files."
LICENSE = "BSD-3-Clause"

PV = "0.12"

RPM_NAME = "ghc-text-zipper-devel-0.12-2.2.aarch64.rpm"
RPM_HASH = "0a0203c968ad535f902d2440a60b20f3a3d6fdf46d76d13646ae4e5ad1672b86dcca8aaa78df96b6c488e907b5e59ba6ae7c11ba6cd379eac9c7e8526076396d"

RPROVIDES:${PN} += "ghc-devel-text-zipper-0.12-HAxIdT2NfEj1pbIOe2MIin \
ghc-text-zipper-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-text-2.0.2 \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-text-zipper"

inherit rpm
