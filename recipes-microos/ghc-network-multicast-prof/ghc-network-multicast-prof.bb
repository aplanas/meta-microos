SUMMARY = "Haskell network-multicast profiling library"
DESCRIPTION = "This package provides the Haskell network-multicast profiling library."
LICENSE = "CC0-1.0"

PV = "0.3.2"

RPM_NAME = "ghc-network-multicast-prof-0.3.2-4.2.aarch64.rpm"
RPM_HASH = "08f14f16afe8380f945b536ba7d549c823948e10e4409ad024f3027d0cce7b94d0f7adb1ca358efe213e2dcfa55e1a5b93a9e46923fa32207233f94248a393c5"

RPROVIDES:${PN} += "ghc-network-multicast-prof \
ghc-network-multicast-prof(aarch-64) \
ghc-prof(network-multicast-0.3.2-GrPQCwnsCBBDUXDpEy9gVm)"
RDEPENDS:${PN} += "ghc-network-multicast-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) \
ghc-prof(network-bsd-2.8.1.0-D1RjTzX7Byx4U4fOdbAEll)"

inherit rpm
