SUMMARY = "Haskell lift-type library development files"
DESCRIPTION = "This package provides the Haskell lift-type library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-lift-type-devel-0.1.1.1-2.2.aarch64.rpm"
RPM_HASH = "1e0c379339d5a339b6630ba9a8b4d22a9b0cfc992d3beb9e9be7690eae21d43e9696ebb912af1f01696976a4b425163aeb15bb7e6c9fb37c87ae9fd7c93348f4"

RPROVIDES:${PN} += "ghc-devel(lift-type-0.1.1.1-2p47b0Ftg8mEbzaiZ22oeB) \
ghc-lift-type-devel \
ghc-lift-type-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(template-haskell-2.19.0.0) \
ghc-lift-type"

inherit rpm
