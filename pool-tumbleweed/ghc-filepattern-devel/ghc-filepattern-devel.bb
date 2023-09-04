SUMMARY = "Haskell filepattern library development files"
DESCRIPTION = "This package provides the Haskell filepattern library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-filepattern-devel-0.1.3-2.11.aarch64.rpm"
RPM_HASH = "32e7fdceed2aa0437e2f7ef6c193432bc5f1e56ba045780f4643e179caea9b5dc54d86f0edac8d70db769ec0d01d6d0b205c88f602044cec0886026397f432d4"

RPROVIDES:${PN} += "ghc-devel-filepattern-0.1.3-4ntZdyOJ0RX8pGnFp1xRde \
ghc-filepattern-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-extra-1.7.14-DfcUn0kURmM7zhMG6RTp91 \
ghc-devel-filepath-1.4.2.2 \
ghc-filepattern"

inherit rpm
