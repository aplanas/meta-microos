SUMMARY = "Haskell hscolour profiling library"
DESCRIPTION = "This package provides the Haskell hscolour profiling library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.4"

RPM_NAME = "ghc-hscolour-prof-1.24.4-4.6.aarch64.rpm"
RPM_HASH = "9245329575d9e6ad325ad0c125880b6b81894da30aad81a8e176ef5f18e1a5ed42662383f4e82259c986053341e6fc75643f8e8c228825c4e5613408089ad27a"

RPROVIDES:${PN} += "ghc-hscolour-prof \
ghc-prof-hscolour-1.24.4-B0NmEhYuPI790UQrsiXLka"

RDEPENDS:${PN} += "ghc-hscolour-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7"

inherit rpm
