SUMMARY = "Haskell filepath-bytestring library development files"
DESCRIPTION = "This package provides the Haskell filepath-bytestring library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.1.13"

RPM_NAME = "ghc-filepath-bytestring-devel-1.4.2.1.13-1.3.aarch64.rpm"
RPM_HASH = "972a015009b118ad2510dd5c2cf9ae8efb25b3cc527328936691caeaacef7bd84ec7c4af98e9ced8dfe928b93103a22b231c3b47682f4a42b2313cef6e7ef23c"

RPROVIDES:${PN} += "ghc-devel-filepath-bytestring-1.4.2.1.13-1FmfoCrfLITG59KaBERpzO \
ghc-filepath-bytestring-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-unix-2.7.3 \
ghc-filepath-bytestring"

inherit rpm
