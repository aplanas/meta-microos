SUMMARY = "Haskell clock library development files"
DESCRIPTION = "This package provides the Haskell clock library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.4"

RPM_NAME = "ghc-clock-devel-0.8.4-1.2.aarch64.rpm"
RPM_HASH = "6f66bfae8da14bc1f40fb4c07b5e48859565774cfe8fec33be0515c09bc3c130ea5cca0a70c6c0f01fd56268c6e773d1c8acf5c70a99fc3c02cf7664b3c8c72f"

RPROVIDES:${PN} += "ghc-clock-devel \
ghc-devel-clock-0.8.4-FaEd7XcSjZTFKcoXlUaX3W"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-clock \
ghc-compiler \
ghc-devel-base-4.17.2.0"

inherit rpm
