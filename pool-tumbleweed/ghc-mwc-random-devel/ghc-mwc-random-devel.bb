SUMMARY = "Haskell mwc-random library development files"
DESCRIPTION = "This package provides the Haskell mwc-random library development files."
LICENSE = "BSD-2-Clause"

PV = "0.15.0.2"

RPM_NAME = "ghc-mwc-random-devel-0.15.0.2-3.6.aarch64.rpm"
RPM_HASH = "008c2de412485f1ec77c40add8574feabf272e2b4067606b8420acb4c5380648dd51b201a248ac6b096a186484f08c271c5e089ead37d463f81ed02790f99e16"

RPROVIDES:${PN} += "ghc-devel-mwc-random-0.15.0.2-ABcRZBX2kH9CBf1bhFwgAP \
ghc-mwc-random-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-math-functions-0.3.4.2-9rV4yQVX6xI3LaPo90WsZk \
ghc-devel-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-devel-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-devel-time-1.12.2 \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-mwc-random"

inherit rpm
