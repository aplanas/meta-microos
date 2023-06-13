SUMMARY = "Haskell network-bsd library development files"
DESCRIPTION = "This package provides the Haskell network-bsd library development files."
LICENSE = "BSD-3-Clause"

PV = "2.8.1.0"

RPM_NAME = "ghc-network-bsd-devel-2.8.1.0-7.2.aarch64.rpm"
RPM_HASH = "1cd603803a7dbb81c83a1fedc282b9d4c0e2359112d660e4fd3755b5897fdf7458b21e55c227fdfc1a14a048df4eb693481baf8414a44d896f002071f1cc208b"

RPROVIDES:${PN} += "ghc-devel(network-bsd-2.8.1.0-D1RjTzX7Byx4U4fOdbAEll) \
ghc-network-bsd-devel \
ghc-network-bsd-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) \
ghc-network-bsd"

inherit rpm
