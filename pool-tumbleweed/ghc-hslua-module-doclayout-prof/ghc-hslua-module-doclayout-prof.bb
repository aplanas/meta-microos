SUMMARY = "Haskell hslua-module-doclayout profiling library"
DESCRIPTION = "This package provides the Haskell hslua-module-doclayout profiling library."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-doclayout-prof-1.1.0-1.7.aarch64.rpm"
RPM_HASH = "bc6702659c7ba70528393276f96f7beabec1b1ed4d6eeb7882f627a7357b3acf467a67139d2a14300f884a8d1f97fb6174f16c6c17a3fdb7c0554fc0ccd6d6f8"

RPROVIDES:${PN} += "ghc-hslua-module-doclayout-prof \
ghc-prof-hslua-module-doclayout-1.1.0-7JiUl1Tpojd4AzUWHDI8Pj"

RDEPENDS:${PN} += "ghc-hslua-module-doclayout-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-doclayout-0.4.0.1-4D8TPYFDHuI6AadIlSPotc \
ghc-prof-hslua-2.3.0-IFweDrinoAduGRRaqkwGX \
ghc-prof-text-2.0.2"

inherit rpm
