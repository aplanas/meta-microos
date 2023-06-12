SUMMARY = "Haskell setlocale library development files"
DESCRIPTION = "This package provides the Haskell setlocale library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.10"

RPM_NAME = "ghc-setlocale-devel-1.0.0.10-4.2.aarch64.rpm"
RPM_HASH = "79449fb6448ffd2228f6d53dc95571df8460064d09d08527b66d1e21bf7a043fe728ca6b7cbe4253488f5b1a95bf964631bda7086f7a0d66791cf3ee505ad825"

RPROVIDES:${PN} += "ghc-devel(setlocale-1.0.0.10-8gNxxDe254d2fufYktFd7s) \
ghc-setlocale-devel \
ghc-setlocale-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-setlocale"

inherit rpm
