SUMMARY = "Haskell math-functions library development files"
DESCRIPTION = "This package provides the Haskell math-functions library development files."
LICENSE = "BSD-2-Clause"

PV = "0.3.4.2"

RPM_NAME = "ghc-math-functions-devel-0.3.4.2-2.3.aarch64.rpm"
RPM_HASH = "619df3bf9500ff51a7ebb231e1ee976c1e553e26a203c89538ea81797e77f17e98338f788a611f6d231e8d48d225ddf43bb8c39baee3825bf8a6c4c3a2d0777d"

RPROVIDES:${PN} += "ghc-devel-math-functions-0.3.4.2-9rV4yQVX6xI3LaPo90WsZk \
ghc-math-functions-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-math-functions"

inherit rpm
