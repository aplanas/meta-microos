SUMMARY = "Haskell deriving-aeson library development files"
DESCRIPTION = "This package provides the Haskell deriving-aeson library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.9"

RPM_NAME = "ghc-deriving-aeson-devel-0.2.9-2.3.aarch64.rpm"
RPM_HASH = "12c1441ce2fe8488f2e67022a4f6a21cec54e65b72938882df4d560861f2d48f01806766af9a7860712d33f7c85fcaa16242c82225dec30eeb3f73fc02c220ea"

RPROVIDES:${PN} += "ghc-deriving-aeson-devel \
ghc-devel-deriving-aeson-0.2.9-H4zgwfPBYrUGAqouOy9tcC"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-deriving-aeson \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0"

inherit rpm
