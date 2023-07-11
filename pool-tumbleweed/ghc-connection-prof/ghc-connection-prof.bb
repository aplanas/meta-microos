SUMMARY = "Haskell connection profiling library"
DESCRIPTION = "This package provides the Haskell connection profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-connection-prof-0.3.1-8.1.aarch64.rpm"
RPM_HASH = "34fc0409f0fb45c51cc6b559541bfa67894b455e2c5a941ac4b3805be934e8f30a65d4a2ebe85ae996b53cd2f875c0af91d3ff24209ba6cca5b9afd6665196e6"

RPROVIDES:${PN} += "ghc-connection-prof \
ghc-prof-connection-0.3.1-E1TQ2BFmXua7xK5tzqGZX7"

RDEPENDS:${PN} += "ghc-connection-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-basement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-socks-0.6.1-8gBEgerYb38E7aCOOcHCwN \
ghc-prof-tls-1.6.0-GPxmmQRGk0xt2NkvZcJeD \
ghc-prof-x509-1.7.7-LWFKTxQvdZ8EaEcgjVF4la \
ghc-prof-x509-store-1.6.9-KWawLwgFfWnohDCwWLuXH \
ghc-prof-x509-system-1.6.7-Bno2ph8WTqq8aOWeNLot6t \
ghc-prof-x509-validation-1.6.12-Ei5K1SyMjWXHl76z2VlUEo"

inherit rpm
