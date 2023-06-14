SUMMARY = "Haskell setlocale profiling library"
DESCRIPTION = "This package provides the Haskell setlocale profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.10"

RPM_NAME = "ghc-setlocale-prof-1.0.0.10-4.2.aarch64.rpm"
RPM_HASH = "6ffd4f5c356c6c008aabaedb230f0a5e7a4956c05b1811b84d068a2461261418e9098ace640356702467c79aee7a4be4ddbfa48fc394686b0b446eb626cc6f47"

RPROVIDES:${PN} += "ghc-prof-setlocale-1.0.0.10-8gNxxDe254d2fufYktFd7s \
ghc-setlocale-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-setlocale-devel"

inherit rpm
