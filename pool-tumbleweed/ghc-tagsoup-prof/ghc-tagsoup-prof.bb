SUMMARY = "Haskell tagsoup profiling library"
DESCRIPTION = "This package provides the Haskell tagsoup profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.14.8"

RPM_NAME = "ghc-tagsoup-prof-0.14.8-6.6.aarch64.rpm"
RPM_HASH = "7e80a14ccf9763fb9bdd3c4dd1a4d2c9fa91f70df42403eea7bcc82c9c01f494d9ed4f8210e9b0dc3b1ddf784326f364b359dac63bb652eb621bcf4d30190c94"

RPROVIDES:${PN} += "ghc-prof-tagsoup-0.14.8-KqOLe3dJpuA4KsHZJW2cTn \
ghc-tagsoup-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-text-2.0.2 \
ghc-tagsoup-devel"

inherit rpm
