SUMMARY = "Haskell mime-types library development files"
DESCRIPTION = "This package provides the Haskell mime-types library development files."
LICENSE = "MIT"

PV = "0.1.1.0"

RPM_NAME = "ghc-mime-types-devel-0.1.1.0-2.3.aarch64.rpm"
RPM_HASH = "d7f4cde7f637c241e0c48edafaaf750f2279395b6bcefb887f26dd3eafb9267b92c44aa442af08db4415f8cec05d1afcbb5b04af1cd0d659090b55a97ade91f5"

RPROVIDES:${PN} += "ghc-devel-mime-types-0.1.1.0-oV8uh4Pssd1mRIrSbk6Ab \
ghc-mime-types-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-text-2.0.2 \
ghc-mime-types"

inherit rpm
