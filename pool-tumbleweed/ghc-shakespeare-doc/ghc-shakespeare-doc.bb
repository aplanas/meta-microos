SUMMARY = "Haskell shakespeare library documentation"
DESCRIPTION = "This package provides the Haskell shakespeare library documentation."
LICENSE = "MIT"

PV = "2.0.30"

RPM_NAME = "ghc-shakespeare-doc-2.0.30-2.6.noarch.rpm"
RPM_HASH = "94daa1b0b5273bee7ae40b1c9e73cff3a38105f25ffabe25a796e4073c55c9501319995b88b359b0430733c2114e7757fb3185e993a3654bc871c8dd922a8ba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-shakespeare-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
