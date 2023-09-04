SUMMARY = "Haskell auto-update library development files"
DESCRIPTION = "This package provides the Haskell auto-update library development files."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "ghc-auto-update-devel-0.1.6-6.8.aarch64.rpm"
RPM_HASH = "06bf5302115557dc319732ab6704eae6ddb4ed4e8328468198f7546b10b08efb9e60e7008f47142f7f3aeec1e69fde00becc0c9a8dbb1b077739449afa7badd6"

RPROVIDES:${PN} += "ghc-auto-update-devel \
ghc-devel-auto-update-0.1.6-KWXusmyBOlPJNN5shLt5Bc"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-auto-update \
ghc-compiler \
ghc-devel-base-4.17.2.0"

inherit rpm
