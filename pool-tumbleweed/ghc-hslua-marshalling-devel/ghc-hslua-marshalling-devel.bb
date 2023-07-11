SUMMARY = "Haskell hslua-marshalling library development files"
DESCRIPTION = "This package provides the Haskell hslua-marshalling library development \
files."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-marshalling-devel-2.3.0-1.6.aarch64.rpm"
RPM_HASH = "69628ee84f919796159b5ec6cdac96eb2f57fd57cfe5b1c54bf953cd31e1e83ad3f4bec5f9623bc528a7d122dff067d017ab033fd9807349f03272016fcaa26c"

RPROVIDES:${PN} += "ghc-devel-hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq \
ghc-hslua-marshalling-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-hslua-marshalling"

inherit rpm
