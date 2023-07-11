SUMMARY = "Haskell hslua-marshalling profiling library"
DESCRIPTION = "This package provides the Haskell hslua-marshalling profiling library."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-marshalling-prof-2.3.0-1.6.aarch64.rpm"
RPM_HASH = "78eaecd022a6810785e5576e1ac922497ea635606e13a63c48947ebb9b6b5ae8d8ab847fe968c45b313fe1b02d124466b9664fa8c93096944dc46a27c1715c1d"

RPROVIDES:${PN} += "ghc-hslua-marshalling-prof \
ghc-prof-hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq"

RDEPENDS:${PN} += "ghc-hslua-marshalling-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2"

inherit rpm
