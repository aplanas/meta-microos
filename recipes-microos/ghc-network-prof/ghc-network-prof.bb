SUMMARY = "Haskell network profiling library"
DESCRIPTION = "This package provides the Haskell network profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.1.2.8"

RPM_NAME = "ghc-network-prof-3.1.2.8-1.3.aarch64.rpm"
RPM_HASH = "2130c9cf0caa7fca573124eed7cda0f6186639264e96af76b8a4fb7e9c62abfd951acd9de7a7e135e30c4528ef79173331fb3fe0d86dcb5fa00e6db898c90e7d"

RPROVIDES:${PN} += "ghc-network-prof ghc-network-prof(aarch-64) ghc-prof(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd)"
RDEPENDS:${PN} += "ghc-network-devel ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(deepseq-1.4.8.0) ghc-prof(directory-1.3.7.1)"

inherit rpm
