SUMMARY = "Haskell syb profiling library"
DESCRIPTION = "This package provides the Haskell syb profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.2.3"

RPM_NAME = "ghc-syb-prof-0.7.2.3-1.2.aarch64.rpm"
RPM_HASH = "07cf6792bc88e2e3feae7c079f6ab1fa01b9c7f24059560e96861780ee443b616ac6a5fe7d218a9b5505cb242a85ca5816a83fd5196f247e7487b654670e0133"

RPROVIDES:${PN} += "ghc-prof-syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i \
ghc-syb-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-syb-devel"

inherit rpm
