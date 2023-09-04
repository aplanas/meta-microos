SUMMARY = "Haskell binary library development files"
DESCRIPTION = "This package provides the Haskell binary library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.1"

RPM_NAME = "ghc-binary-devel-0.8.9.1-1.1.aarch64.rpm"
RPM_HASH = "63b3866026b56b8dfea08872a311b031634628dcae032b4cb84450e526a5717aebf385a797217ce7dc73a5bacc9ab3afa7e3aff6cd4de995d29678c93001c59c"

RPROVIDES:${PN} += "ghc-binary-devel \
ghc-binary-static \
ghc-devel-binary-0.8.9.1"

RDEPENDS:${PN} += "ghc-binary \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7"

inherit rpm
