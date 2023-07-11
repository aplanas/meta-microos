SUMMARY = "Haskell unicode-data profiling library"
DESCRIPTION = "This package provides the Haskell unicode-data profiling library."
LICENSE = "Apache-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-data-prof-0.4.0.1-3.6.aarch64.rpm"
RPM_HASH = "12212ea4e30b8da6116f6e401a2ad52ea5ca651933a04515d53e051a652eda2e8fdf6d3b69e322ff7ec34ca4cbd6918358beda6c9aa03201b69db8e62218f71d"

RPROVIDES:${PN} += "ghc-prof-unicode-data-0.4.0.1-IPznodd4J0BGoSZPR6u4lO \
ghc-unicode-data-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-unicode-data-devel"

inherit rpm
