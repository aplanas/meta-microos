SUMMARY = "Haskell connection library development files"
DESCRIPTION = "This package provides the Haskell connection library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-connection-devel-0.3.1-8.1.aarch64.rpm"
RPM_HASH = "ddfb90af06dcdee8eacc29890872fc8ec68024adb8b2200f534ce89151cd1350ed1f4508a429c759831c07791663f64877ab41c5ac8a9ae541dca916981b3794"

RPROVIDES:${PN} += "ghc-connection-devel \
ghc-devel-connection-0.3.1-E1TQ2BFmXua7xK5tzqGZX7"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-connection \
ghc-devel-base-4.17.1.0 \
ghc-devel-basement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-devel-socks-0.6.1-8gBEgerYb38E7aCOOcHCwN \
ghc-devel-tls-1.6.0-GPxmmQRGk0xt2NkvZcJeD \
ghc-devel-x509-1.7.7-LWFKTxQvdZ8EaEcgjVF4la \
ghc-devel-x509-store-1.6.9-KWawLwgFfWnohDCwWLuXH \
ghc-devel-x509-system-1.6.7-Bno2ph8WTqq8aOWeNLot6t \
ghc-devel-x509-validation-1.6.12-Ei5K1SyMjWXHl76z2VlUEo"

inherit rpm
