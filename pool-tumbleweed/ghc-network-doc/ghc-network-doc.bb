SUMMARY = "Haskell network library documentation"
DESCRIPTION = "This package provides the Haskell network library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.1.4.0"

RPM_NAME = "ghc-network-doc-3.1.4.0-1.3.noarch.rpm"
RPM_HASH = "f51fe153e413a8ac32ecf620a0a9c68e9051aa81d8b954d0afe64407a70e0c8be44ed4264afba1fb70c7ffac17a78edd5fda1af8e6aa17c3f5767aeea7c1a316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
