SUMMARY = "Haskell network-multicast library development files"
DESCRIPTION = "This package provides the Haskell network-multicast library development \
files."
LICENSE = "CC0-1.0"

PV = "0.3.2"

RPM_NAME = "ghc-network-multicast-devel-0.3.2-4.2.aarch64.rpm"
RPM_HASH = "5868cdb37bdd396340c1c8c6e24578bb77b07f33af2dd6bed58d919f172b2f029c97ffa315ff3c2d950f867a3fb18205c2fa550e3b8d428782d9c8a14250c9cd"

RPROVIDES:${PN} += "ghc-devel(network-multicast-0.3.2-GrPQCwnsCBBDUXDpEy9gVm) \
ghc-network-multicast-devel \
ghc-network-multicast-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) \
ghc-devel(network-bsd-2.8.1.0-D1RjTzX7Byx4U4fOdbAEll) \
ghc-network-multicast"

inherit rpm
