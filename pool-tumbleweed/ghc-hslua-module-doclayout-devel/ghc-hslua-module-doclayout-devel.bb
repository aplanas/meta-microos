SUMMARY = "Haskell hslua-module-doclayout library development files"
DESCRIPTION = "This package provides the Haskell hslua-module-doclayout library \
development files."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-doclayout-devel-1.1.0-1.7.aarch64.rpm"
RPM_HASH = "e0a8d308e87aa3622e40a8aa327552ef2ad6aacee97f8974c2eb097fbd145953bc8daabba16682850f6349dac221134e0cfc30c432ddd4c0e9332d0828ac85a0"

RPROVIDES:${PN} += "ghc-devel-hslua-module-doclayout-1.1.0-7JiUl1Tpojd4AzUWHDI8Pj \
ghc-hslua-module-doclayout-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-doclayout-0.4.0.1-4D8TPYFDHuI6AadIlSPotc \
ghc-devel-hslua-2.3.0-IFweDrinoAduGRRaqkwGX \
ghc-devel-text-2.0.2 \
ghc-hslua-module-doclayout"

inherit rpm
