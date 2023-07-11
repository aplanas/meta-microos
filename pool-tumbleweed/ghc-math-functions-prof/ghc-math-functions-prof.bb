SUMMARY = "Haskell math-functions profiling library"
DESCRIPTION = "This package provides the Haskell math-functions profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.3.4.2"

RPM_NAME = "ghc-math-functions-prof-0.3.4.2-2.6.aarch64.rpm"
RPM_HASH = "53258de9208166a247405dc2a313c03bf6b8872a07b3163f091c015f4c16ab4e2a756fc0c2cd8bc9ae9e00ace20f6f2804ea5a397bf53c1d1e1762c6a3c3a0db"

RPROVIDES:${PN} += "ghc-math-functions-prof \
ghc-prof-math-functions-0.3.4.2-9rV4yQVX6xI3LaPo90WsZk"

RDEPENDS:${PN} += "ghc-math-functions-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
