SUMMARY = "Haskell bytestring library development files"
DESCRIPTION = "This package provides the Haskell bytestring library development files."
LICENSE = "BSD-3-Clause"

PV = "0.11.4.0"

RPM_NAME = "ghc-bytestring-devel-0.11.4.0-3.2.aarch64.rpm"
RPM_HASH = "9cf088bcfd5a72dec00f1fd83b3670dedf170e9af75a880b04acc818e797aa00cbbefc2c4594a21e0c5f1c5403ae90bc0577ea38f7a061c1d0dde7e51ed31746"

RPROVIDES:${PN} += "ghc-bytestring-devel \
ghc-bytestring-static \
ghc-devel-bytestring-0.11.4.0"

RDEPENDS:${PN} += "ghc-bytestring \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-template-haskell-2.19.0.0"

inherit rpm
