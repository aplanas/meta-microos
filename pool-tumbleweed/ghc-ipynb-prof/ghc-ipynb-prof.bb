SUMMARY = "Haskell ipynb profiling library"
DESCRIPTION = "This package provides the Haskell ipynb profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-ipynb-prof-0.2-2.6.aarch64.rpm"
RPM_HASH = "0fb0b1a4edc4254291f5dc5462f3acf7f921c5616b29cd51515dd701449e0337e1910a20a255fa051b16bcad7c3e1d1a1e36ea4781a4f124ccaa256431a054a7"

RPROVIDES:${PN} += "ghc-ipynb-prof \
ghc-prof-ipynb-0.2-Ij25To1hTXLCW4aPHIgo1Y"

RDEPENDS:${PN} += "ghc-ipynb-devel \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-base-4.17.2.0 \
ghc-prof-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-text-2.0.2 \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn"

inherit rpm
